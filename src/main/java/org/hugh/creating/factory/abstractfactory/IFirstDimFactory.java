package org.hugh.creating.factory.abstractfactory;

/**
 * 按类的第一维度定义方法（方法名区别）
 * 按第二维度创建具体工厂类（类名区别）
 * @author Hao Du
 * @version 1.0
 * @date 2021/6/12
 */
public interface IFirstDimFactory {

    IFirstDimOneProduct createFirstDimOneProduct();
    IFirstDimTwoProduct createFirstDimTwoProduct();
}
