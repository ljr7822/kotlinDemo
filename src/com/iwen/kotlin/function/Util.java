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
        // 3.饿汉式访问单例
        //Util1.instance
    }

}

/**
 * 饿汉式单例模式
 */
class Util1{
    // 2.提供一个接收对象 外部可以访问
    public static Util1 instance = new Util1();

    // 1.私有化构造方法
    private Util1(){
        System.out.println("我是饿汉式单例模式，被访问到了");
        // 4.访问懒汉式单例
        Util2.getInstance();
    }
}

/**
 * 懒汉式单例模式
 */
class Util2{
    // 2.提供一个接收对象 外部不可以访问
    private static Util2 defatult;

    // 1.私有化构造方法
    private Util2(){
        System.out.println("我是懒汉式单例模式，被访问到了");
    }
    // 3.提供一个外部访问的方法
    public static Util2 getInstance(){
        if (defatult == null){
            synchronized (Util2.class){
                if (defatult == null){
                    defatult = new Util2();
                }
            }
        }
        return defatult;
    }
}

