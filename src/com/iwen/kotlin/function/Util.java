package com.iwen.kotlin.function;

/**
 * 当Util类被调用 -> 加载Util类到内存中 -> 加载进去的是类对象Class,同时静态内容被创建
 *
 * @Author: iwen大大怪
 * @DateTime: 2020/7/16 12:51
 */
public class Util {
    public static String URL = "www.baidu.com";
    /**
     * 静态方法
     */
    public static void loadData(){
        System.out.println("下载图片");
    }

    /**
     * 实例方法 必须实例化类对象,用这个类的对象来创建
     */
    public void show(){

    }
}
