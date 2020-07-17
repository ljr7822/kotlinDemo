package com.iwen.kotlin.classandobject

/**
 * Kotlin 的接口可以既包含抽象方法的声明也包含实现。
 * 与抽象类不同的是，接口无法保存状态。它可以有属性但必须声明为抽象或提供访问器实现。
 *
 * @Author: iwen大大怪
 * @DateTime: 2020/7/17 12:46
 */
// 使用关键字 interface 来定义接口
interface MyInterface{
    fun bar()

    fun foo(){
        println("这是foo函数")
    }
}

// 实现接口
class Child:MyInterface{
    override fun bar() {
        println("这是bar函数")
    }

    override fun foo() {
        println("修改foo函数")
    }
}

/**
 * 接口中的属性
 * 可以在接口中定义属性。在接口中声明的属性要么是抽象的，要么提供访问器的实现。
 * 在接口中声明的属性不能有幕后字段（backing field），因此接口中声明的访问器不能引用它们。
 */
interface MyInterface2{
    val prop: Int // 抽象的

    val propertyWithImplementation: String
        get() = "foo"

    fun foo(){
        println(prop)
    }
}

class Child2:MyInterface2{
    override val prop: Int = 29
}

fun main(){
    // 调用接口
    Child().bar()
    Child().foo()
}