package org.hugh.behavior.observer;

/**
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/10
 */
public class ConcreteObserver implements Observer{
    @Override
    public void update() {
        System.out.println(this.getClass().getSimpleName() + " update");
    }
}
