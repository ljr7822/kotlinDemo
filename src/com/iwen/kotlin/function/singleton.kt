package com.iwen.kotlin.function

/**
 * 单例
 *
 * @Author: iwen大大怪
 * @DateTime: 2020/7/16 13:17
 */
fun main() {
    // 3.饿汉式访问单例
    Person.instance.show()
    // 3.懒汉式访问单例
    Sqlite.getInstance().show()
    // 3.懒汉式改造访问单例
    Sqlite2.default.show()
}

/**
 * 饿汉式
 */
class Person private constructor(){
    // 1.私有化构造方法 private constructor()
    // 2.创建单例对象
    companion object{
        val instance = Person()
    }
    fun show(){
        println("hello 饿汉式")
    }
}

/**
 * 懒汉式
 */
class Sqlite private constructor(){
    // 1.私有化构造方法 private constructor()
    // 2.创建单例对象
    companion object{
        var default:Sqlite? = null

        fun getInstance():Sqlite{
            if (default == null){
                synchronized(this) {
                    default = Sqlite()
                }
            }
            return default!!
        }
    }
    fun show(){
        println("hello 懒汉式")
    }
}

/**
 * 懒汉式 改造
 */
class Sqlite2 private constructor(){
    // 1.私有化构造方法 private constructor()
    // 2.创建单例对象
    companion object{
        val default:Sqlite2 by lazy(LazyThreadSafetyMode.SYNCHRONIZED){
            Sqlite2()
        }
    }
    fun show(){
        println("hello 懒汉式 改造")
    }
}
//***************