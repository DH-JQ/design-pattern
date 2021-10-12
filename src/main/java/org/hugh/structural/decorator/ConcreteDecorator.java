package org.hugh.structural.decorator;

/**
 * @author Hao Du
 * @version 1.0
 * @date 2021/6/12
 */
public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        System.out.println("concrete decorator");
        this.component.operation();
    }
}
