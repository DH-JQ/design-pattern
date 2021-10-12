package org.hugh.behavior.strategy;

/**
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/11
 */
public class ConcreteStrategyA implements Strategy{
    @Override
    public void algorithmInterface() {
    // 具体算法实现
    }

    @Override
    public StrategyType getType() {
        return StrategyType.CONCRETE_A;
    }
}
