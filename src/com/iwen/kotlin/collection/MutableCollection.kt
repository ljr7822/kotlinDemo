package com.iwen.kotlin.collection

/**
 * MutableCollection 是一个具有写操作的 Collection 接口，例如 add 以及 remove。
 *
 * @Author: iwen大大怪
 * @DateTime: 2020/7/16 23:52
 */
// 使用扩展函数
fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int) {
    this.filterTo(shortWords) {
        it.length <= maxLength
    }
    // 去掉关键词
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWords -= articles
}

fun main() {
    val words = "A long time ago in a galaxy far far away".split(" ") // split通过指定分隔符对字符串进行切片
    val shortWords = mutableListOf<String>()
    words.getShortWordsTo(shortWords, 4)
    println(shortWords)
}