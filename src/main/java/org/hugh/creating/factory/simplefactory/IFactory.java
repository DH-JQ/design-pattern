package org.hugh.creating.factory.simplefactory;

import org.hugh.creating.factory.IProduct;

public interface IFactory{
    IProduct createProduct(String type);
}
