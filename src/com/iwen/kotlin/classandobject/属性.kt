package com.iwen.kotlin.classandobject

/**
 * 声明属性: Kotlin 类中的属性既可以用关键字 var 声明为可变的，也可以用关键字 val 声明为只读的
 *
 * @Author: iwen大大怪
 * @DateTime: 2020/7/17 12:39
 */
class Address {
    // 默认要赋值，否则会报错
    var name: String = "jack"
    var street: String = "Baker"
    var city: String = "重庆"
    var state: String? = null
    var zip: String = "123456"
}

fun copyAddress(address: Address):Address{
    val result = Address() // Kotlin 中没有“new”关键字
    result.name = address.name
    result.state = address.state
    return result
}

fun main(){
    var adder = Address()
    print(adder.name)
}