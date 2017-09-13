package com.htzhu.singleton_pattern;

/**
 * Created by htzhu on 2017/9/13.
 */
public class SingletonTest {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        System.err.println(singleton1 == singleton2);

    }
}
