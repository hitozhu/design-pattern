package com.htzhu.abstract_factory_pattern.factory;

import com.htzhu.abstract_factory_pattern.pojo.Shape;
import com.htzhu.abstract_factory_pattern.pojo.Color;

/**
 * Created by htzhu on 2017/9/13.
 */
public abstract class AbstractFactory {

    abstract Color getColor(Class<?extends Color> clazz);
    abstract Shape getShape(Class<?extends Shape> clazz);

}
