package com.iwen.kotlin

/**
 * kotlin默认定义属性时会自动创建对应的set和get方法
 * val 常量属性 只有get
 * var 变量属性 有set get
 *
 * @Author: iwen大大怪
 * @DateTime: 2020/7/13 13:39
 */
class Shape(){
    // 配置set和get方法
    var name: String = "triangle" // 定义的时候直接给值
        set(value) { field = value.toUpperCase() } // 设置set方法
        // get() = field.toLowerCase()

    // 属性私有化：不让外部设置
    var password:String = "123"
        private set
}

fun main() {
    val shape = Shape()

    shape.name = "Triangle" // 调用set方法
    println(shape.name) // 调用get方法
}