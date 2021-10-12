package org.hugh.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/10
 */
public class ConcreteSubject implements Subject{

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void publish() {
        observers.forEach(Observer::update);
    }
}
