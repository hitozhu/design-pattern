package com.htzhu.abstract_factory_pattern.factory;

import com.htzhu.abstract_factory_pattern.pojo.Color;
import com.htzhu.abstract_factory_pattern.pojo.Shape;

/**
 * Created by htzhu on 2017/9/13.
 */
public class ColorFactory extends AbstractFactory {

    Color getColor(Class<? extends Color> clazz) {
        Color color;

        try {
            color = (Color) Class.forName(clazz.getName()).newInstance();
            return color;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    Shape getShape(Class<? extends Shape> clazz) {
        return null;
    }
}
