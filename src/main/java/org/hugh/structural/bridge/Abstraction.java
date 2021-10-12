package org.hugh.structural.bridge;

/**
 * 类比JDBC DriverManager的抽象
 * 抽象：跟具体无关的类库，比如JDBC
 * 实现：根据具体实现相关的类库，比如具体厂商的Driver
 *
 * 通过委托的方式，将具体的实现注册到抽象中
 *
 * @author Hao Du
 * @version 1.0
 * @date 2021/6/12
 */
public abstract class Abstraction {
    protected Implementation implementation;

    /**
     * 注册具体的实现
     * @param implementation 实现
     */
    public abstract void register(Implementation implementation);
}
