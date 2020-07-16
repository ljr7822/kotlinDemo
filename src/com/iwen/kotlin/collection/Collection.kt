package com.iwen.kotlin.collection

/**
 * kotlin集合
 *
 * @Author: iwen大大怪
 * @DateTime: 2020/7/16 23:48
 */
/**
 * Collection<T> 是集合层次结构的根。此接口表示一个只读集合的共同行为：检索大小、检测是否为成员等等。
 * Collection 继承自 Iterable <T> 接口，它定义了迭代元素的操作。
 * 可以使用 Collection 作为适用于不同集合类型的函数的参数。对于更具体的情况，请使用 Collection 的继承者： List 与 Set。
 */
fun printAll(strings: Collection<String>) {
    for(s in strings) print("$s ")
    println()
}

fun main() {
    val stringList = listOf("one", "two", "one")
    printAll(stringList)

    val stringSet = setOf("one", "two", "three")
    printAll(stringSet)
}