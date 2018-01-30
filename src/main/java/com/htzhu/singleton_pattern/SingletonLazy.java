package com.htzhu.singleton_pattern;

/**
 * 设计模式 - 单例模式（懒汉）
 *
 * @author zhuhaitao
 * @date 2018/1/29 下午9:20
 */
public class SingletonLazy {

    /**
     * 构造方法私有化
     */
    private SingletonLazy() {
    }

    private static SingletonLazy singletonLazy = null;

    /**
     * 获取实例对象（非线程安全）
     *
     * @return
     */
    public static SingletonLazy getSingletonThreadUnsafe() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }


    /**
     * 获取单利对象（线程安全）
     *
     * @return
     */
    public static SingletonLazy getSingletonThreadSafe() {
        if (singletonLazy == null) {
            synchronized (SingletonLazy.class) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (singletonLazy == null) {
                    singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    }

}
