package org.hugh.behavior.visitor;

/**
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/17
 */
public interface Visitor {
    void visit(ConcreteVisitableA visitable);
    void visit(ConcreteVisitableB visitable);
}
