package org.hugh.creating.factory.simplefactory;

import org.hugh.creating.factory.ConcreteProductA;
import org.hugh.creating.factory.ConcreteProductB;
import org.hugh.creating.factory.IProduct;

public class SimpleFactory implements IFactory {
    private static final String typeA = "A";
    private static final String typeB = "B";

    @Override
    public IProduct createProduct(String type) {
        if (typeA.equals(type)) {
            return new ConcreteProductA();
        } else if (typeB.equals(type)) {
            return new ConcreteProductB();
        }
        return null;
    }
}
