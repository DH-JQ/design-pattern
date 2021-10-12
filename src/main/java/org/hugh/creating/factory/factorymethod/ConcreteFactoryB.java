package org.hugh.creating.factory.factorymethod;

import org.hugh.creating.factory.ConcreteProductA;
import org.hugh.creating.factory.IProduct;

public class ConcreteFactoryB implements IFactory {
    @Override
    public IProduct createProduct() {
        return new ConcreteProductA();
    }
}
