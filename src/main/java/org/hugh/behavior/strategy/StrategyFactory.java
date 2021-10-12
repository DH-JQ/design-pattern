package org.hugh.behavior.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 策略类工厂可以使用反射方式实现，避免修改工厂类
 *
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/11
 */
public class StrategyFactory {
    private static final Map<StrategyType, Strategy> STRATEGIES = new ConcurrentHashMap<>();

    static {
        STRATEGIES.put(StrategyType.CONCRETE_A, new ConcreteStrategyA());
        STRATEGIES.put(StrategyType.CONCRETE_B, new ConcreteStrategyB());
    }

    public static Strategy getStrategy(StrategyType strategyType) {
        if (strategyType == null) {
            throw new IllegalArgumentException("strategy type is null");
        }
        return STRATEGIES.get(strategyType);
    }
}
