package org.hugh.behavior.template;

/**
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/10
 */
public class ConcreteImpl extends AbstractTemplate{
    @Override
    protected void doSomething() {
        System.out.println(this.getClass().getSimpleName() + " doSomething");
    }
}
