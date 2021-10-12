package org.hugh.behavior.observer;

/**
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/10
 */
public interface Subject {
    void register(Observer o);

    void remove(Observer o);

    void publish();
}
