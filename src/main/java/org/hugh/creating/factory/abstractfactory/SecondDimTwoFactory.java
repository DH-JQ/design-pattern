package org.hugh.creating.factory.abstractfactory;

/**
 * @author Hao Du
 * @version 1.0
 * @date 2021/6/12
 */
public class SecondDimTwoFactory implements IFirstDimFactory{
    @Override
    public IFirstDimOneProduct createFirstDimOneProduct() {
        return new FirstOneSecondTwoProduct();
    }

    @Override
    public IFirstDimTwoProduct createFirstDimTwoProduct() {
        return new FirstTwoSecondTwoProduct();
    }
}
