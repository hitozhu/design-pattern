package com.htzhu.factory_pattern.factory;

import com.htzhu.factory_pattern.pojo.Shape;

/**
 * Created by htzhu on 2017/9/13.
 */
public class ShapeFactory {

    /**
     * 使用反射，获取图形对象
     * @return
     */
    public static Object getShape(Class<?extends Shape> clazz) throws ClassNotFoundException {

        Object obj;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
            return obj;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

}
