package org.hugh.structural.bridge;

/**
 * DriverManager接口实现类
 * @author Hao Du
 * @version 1.0
 * @date 2021/6/12
 */
public class RefineAbstraction extends Abstraction{

    @Override
    public void register(Implementation implementation) {
        this.implementation = implementation;
    }
}
