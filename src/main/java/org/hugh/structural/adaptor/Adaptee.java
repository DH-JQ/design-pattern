package org.hugh.structural.adaptor;

/**
 * 被适配类
 * Adaptee接口不多，两种方法都可以
 * Adaptee接口很多，契合度很高，使用类适配器，可以复用Adaptee类代码
 * Adaptee接口很多，契合度很低，使用对象适配器，组合相对于继承更加灵活
 *
 * @author Hao Du
 * @version 1.0
 * @date 2021/6/12
 */
public class Adaptee {
    public void specificRequest() {}

}
