package com.htzhu.abstract_factory_pattern.factory;

import com.htzhu.abstract_factory_pattern.pojo.Color;
import com.htzhu.abstract_factory_pattern.pojo.Shape;

/**
 * Created by htzhu on 2017/9/13.
 */
public class ShapeFactory extends AbstractFactory {

    Color getColor(Class<?extends Color> clazz) {
        return null;
    }

    Shape getShape(Class<?extends Shape> clazz) {
        Shape shape;
        try {
            shape = (Shape) Class.forName(clazz.getName()).newInstance();
            return shape;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
