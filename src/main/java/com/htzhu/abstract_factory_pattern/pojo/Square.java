package com.htzhu.abstract_factory_pattern.pojo;

import com.htzhu.abstract_factory_pattern.pojo.Shape;

/**
 * Created by htzhu on 2017/9/13.
 */
public class Square implements Shape {
    public void draw() {
        System.err.println("Square draw()...");
    }
}
