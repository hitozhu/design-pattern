package com.htzhu.singleton_pattern;

/**
 * 设计模式 - 单例模式（饿汉）
 *
 * @author zhuhaitao
 * @date 2018/1/29 下午9:47
 */
public class SingletonHungry {

    /**
     * 构造方法私有化
     */
    private SingletonHungry() {
    }

    /**
     * 直接实例化对象
     */
    private static SingletonHungry singletonHungry = new SingletonHungry();

    /**
     * 静态代码块初始化
     */
//    static {
//        singletonHungry = new SingletonHungry();
//    }

    /**
     * 获取实例对象
     *
     * @return
     */
    public static SingletonHungry getSingleton() {
        return singletonHungry;
    }

}
