package org.hugh.structural.decorator;

/**
 * @author Hao Du
 * @version 1.0
 * @date 2021/6/12
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("concrete component");
    }
}
