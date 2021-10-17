package org.hugh.behavior.visitor;

/**
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/17
 */
public interface Visitable {
    /**
     * 聚合visitor，委托visitor执行访问方法
     * @param visitor
     */
    void accept(Visitor visitor);
}
