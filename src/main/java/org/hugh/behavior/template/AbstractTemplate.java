package org.hugh.behavior.template;

/**
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/10
 */
public abstract class AbstractTemplate {

    protected abstract void doSomething();

    public final void templateMethod() {
        doSomething();
    }
}
