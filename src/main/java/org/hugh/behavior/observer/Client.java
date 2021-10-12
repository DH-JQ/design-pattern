package org.hugh.behavior.observer;

/**
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/10
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.register(observer);

        subject.publish();
    }
}
