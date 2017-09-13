package com.htzhu.observer_pattern;

/**
 * Created by htzhu on 2017/9/13.
 */
public class ObserverPatternTest {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        subject.setState(15);

        subject.setState(10);
    }
}
