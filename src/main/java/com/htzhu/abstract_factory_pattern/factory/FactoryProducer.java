package com.htzhu.abstract_factory_pattern.factory;

/**
 * Created by htzhu on 2017/9/13.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(Class<?extends AbstractFactory> clazz){

        AbstractFactory factory;

        try {
            factory = (AbstractFactory) Class.forName(clazz.getName()).newInstance();

            return factory;
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
