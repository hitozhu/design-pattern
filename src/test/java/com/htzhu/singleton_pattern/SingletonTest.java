package com.htzhu.singleton_pattern;

import org.junit.Assert;
import org.junit.Test;

/**
 * 单例模式测试类
 *
 * @author zhuhaitao
 * @date 2018/1/29 下午9:39
 */
public class SingletonTest {

    public class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(SingletonLazy.getSingletonThreadSafe().hashCode());
        }
    }


    @Test
    public void test1() throws InterruptedException {

        MyThread[] mts = new MyThread[10];
        for (int i = 0; i < mts.length; i++) {
            mts[i] = new MyThread();
        }

        for (int j = 0; j < mts.length; j++) {
            mts[j].start();
        }

        Thread.sleep(10000);
    }

    @Test
    public void test2() {

        SingletonHungry singleton1 = SingletonHungry.getSingleton();
        SingletonHungry singleton2 = SingletonHungry.getSingleton();
        Assert.assertEquals(singleton1, singleton2);
    }

}
