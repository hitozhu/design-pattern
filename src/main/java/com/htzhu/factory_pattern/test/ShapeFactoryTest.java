package com.htzhu.factory_pattern.test;

import com.htzhu.factory_pattern.factory.ShapeFactory;
import com.htzhu.factory_pattern.pojo.Circle;
import com.htzhu.factory_pattern.pojo.Rectangle;
import com.htzhu.factory_pattern.pojo.Shape;
import com.htzhu.factory_pattern.pojo.Square;

/**
 * Created by htzhu on 2017/9/13.
 */
public class ShapeFactoryTest {

    public static void main(String[] args) {
        try {
            Shape shape1 = (Shape) ShapeFactory.getShape(Rectangle.class);
            shape1.draw();

            Shape shape2 = (Shape) ShapeFactory.getShape(Circle.class);
            shape2.draw();

            Shape shape3 = (Shape) ShapeFactory.getShape(Square.class);
            shape3.draw();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
