package com.iwen.kotlin.reflection

import kotlin.reflect.full.declaredMemberExtensionProperties
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.primaryConstructor

/**
 * 反射
 * 1.如何获取字节码文件  查看类型快捷键 ：ctrl+Q
 *
 * @Author: iwen大大怪
 * @DateTime: 2020/7/18 12:32
 */
fun main() {
    /**
     * 1.获取字节码文件  查看类型快捷键 ：ctrl+Q
     */
    // a.只知道类名
    val clz = Person::class
    // b.如果已经知道某个类
    val xw = Person()
    val clz2 = xw.javaClass.kotlin

    /**
     * 通过class对象获取类的信息
     */
    println(clz.simpleName) // 类名
    println(clz2.qualifiedName) // 全类名 有详细包名

    /**
     * 2.获取类的属性
     */
    // 获取当前类和父类的所有属性
    println("获取当前类和父类的所有属性:")
    clz.memberProperties.forEach { println(it) }
    // 获取自己的属性
    println("获取自己的属性:")
    clz.declaredMemberProperties.forEach { println(it) }

    /**
     * 3.获取类的方法
     */
    println("获取主构造函数:")
    clz.primaryConstructor.also { println(it) }
    println("获取所有构造函数:")
    clz.constructors.forEach { println(it) }

}

open class Father(){
    var address:String = "西大"
}
class Person() : Father() {
    var name: String = "小李"
    val age: Int = 20

    constructor(name: String) : this() {
        this.name = name
    }

    fun show(des: String) {

    }
}