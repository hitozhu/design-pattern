package com.htzhu.singleton_pattern;

/**
 * Created by htzhu on 2017/9/13.
 */
public class Singleton {

    /**
     * 构造函数私有化
     */
    private Singleton(){}

    /**
     * 懒汉模式
     */
    private static Singleton singleton = null;

    /**
     * 对外提供的实例化对象方法
     * @return
     */
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized(Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
