package com.iwen.kotlin

/**
 * 继承：在已有类的基础上添加新的方法和属性
 * kotlin里面的类默认是不能被继承、且只能单继承
 *
 * @Author: iwen大大怪
 * @DateTime: 2020/7/13 13:17
 */

open class Father(var name:String, var age:Int = 30){
    open fun work(){
        println("干农活")
    }
}

class Child(name: String) : Father(name, 40){
    fun show(){
        println("my name is $name age is $age")
    }
    // 子类重写父类方法必须使用 override 关键字
    override fun work() {
        println("写作业")
    }
}

fun main() {
    Child("小王").show()
    Child("小王").work()
}