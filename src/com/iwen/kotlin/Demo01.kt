package com.iwen.kotlin

/**
 * 在class里创建main主函数
 *
 * @Author: iwen大大怪
 * @DateTime: 2020/6/28 21:19
 */
class Demo01 {
    companion object { //我是静态块
        /**
         这里面定义的静态变量跟静态方法，类似java的：static
         **/
        @JvmStatic
        /** 我是main入口函数 **/
        fun main(args: Array<String>) {
            add(1)
        }
    }
}
/** 我是main入口函数 **/
fun main(){
    add(2)
}

fun add(a: Int) {
    when (a) {
        1 -> print("a == 1")
        2 -> print("a == 2")
        else -> { // 注意这个块
            print("a is neither 1 nor 2")
        }
    }
}