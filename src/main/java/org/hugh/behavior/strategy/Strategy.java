package org.hugh.behavior.strategy;

/**
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/11
 */
public interface Strategy {

    /**
     * 算法，策略接口实现
     */
    void algorithmInterface();

    /**
     * 策略类型
     * @return 对应策略类型，用于标注特定策略
     */
    StrategyType getType();
}
