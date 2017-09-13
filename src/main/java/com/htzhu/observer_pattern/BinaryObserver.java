package com.htzhu.observer_pattern;

/**
 * Created by htzhu on 2017/9/13.
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString(subject.getState() ) );
    }
}
