package org.hugh.creating.builder;

public class ConcreteProduct implements IProduct {
    private int id;
    private String name;

    /**
     *
     * @param builder
     */
    public ConcreteProduct(AbstractBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        System.out.println("调用ConcreteProduct的构造函数");

    }
}
