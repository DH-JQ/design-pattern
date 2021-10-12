package org.hugh.structural.facade;

/**
 * 接口易用性，
 * RPC调用性能问题
 * 事务管理问题
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/10
 */
public class Facade {
    private final SubSystem subSystem;

    public Facade(SubSystem subSystem) {
        this.subSystem = subSystem;
    }

    public void doAction() {
        subSystem.aMethod();

        subSystem.cMethod();
    }
}
