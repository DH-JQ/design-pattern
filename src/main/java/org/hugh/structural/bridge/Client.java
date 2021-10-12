package org.hugh.structural.bridge;

/**
 * 可以通过配置方式实现注册
 *
 * @author Hao Du
 * @version 1.0
 * @date 2021/6/12
 */
public class Client {
    public static void main(String[] args) {
        RefineAbstraction refineAbstraction = new RefineAbstraction();
        refineAbstraction.register(new ConcreteImpl());
    }
}
