package com.iwen.kotlin.function

/**
 * kotlin 高阶函数
 *
 * @Author: iwen大大怪
 * @DateTime: 2020/7/11 21:08
 */
fun main(){
    // 判断最长单词
//    val list = listOf("apple","pear","banana","watermelon")
//    val result = list.maxBy { it.length }
//    println(result)

    val a = 1
    val b = 6
    // kotlin 中的 :: 是将函数作为参数使用
    println(num1AndNum2(a,b,::plus))

}


fun plus(num1: Int,num2: Int):Int{
    return num1 + num2
}

fun num1AndNum2(num1:Int, num2:Int, operation: (Int,Int) -> Int):Int{
    return operation(num1,num2)
}