package org.hugh.creating.factory.factorymethod;

import org.hugh.creating.factory.IProduct;
import org.hugh.creating.factory.ConcreteProductA;

public class ConcreteFactoryA implements IFactory {
    @Override
    public IProduct createProduct() {
        return new ConcreteProductA();
    }
}
