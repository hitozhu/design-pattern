package com.htzhu.observer_pattern;

/**
 * Created by htzhu on 2017/9/13.
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();

}
