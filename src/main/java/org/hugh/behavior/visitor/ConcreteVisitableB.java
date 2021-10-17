package org.hugh.behavior.visitor;

/**
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/17
 */
public class ConcreteVisitableB implements Visitable{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
