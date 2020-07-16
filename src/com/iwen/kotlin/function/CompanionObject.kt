package com.iwen.kotlin.function

/**
 * 函数 伴生对象(Companion object) == 静态对象
 * HttpRequest类 -> 加载到内存：类对象 Class (静态属性、静态方法) -> 构造时：对象(成员属性、实例方法)
 *
 * @Author: iwen大大怪
 * @DateTime: 2020/7/16 12:47
 */
fun main() {
    HttpRequest.URL
    HttpRequest.loadData()
}

class HttpRequest{
    companion object{
        var URL:String = "http://www.baidu.com"
        fun loadData(){
            println("下载数据")
        }
    }
}