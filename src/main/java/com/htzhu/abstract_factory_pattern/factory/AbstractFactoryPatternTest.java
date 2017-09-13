package com.htzhu.abstract_factory_pattern.factory;

import com.htzhu.abstract_factory_pattern.pojo.*;

/**
 * Created by htzhu on 2017/9/13.
 */
public class AbstractFactoryPatternTest {

    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory(ShapeFactory.class);

        Shape shape = shapeFactory.getShape(Rectangle.class);
        shape.draw();

        shape = shapeFactory.getShape(Square.class);
        shape.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory(ColorFactory.class);
        Color color = colorFactory.getColor(Blue.class);
        color.fill();

        color = colorFactory.getColor(Green.class);
        color.fill();

    }
}
