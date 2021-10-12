package org.hugh.structural.adaptor;

/**
 * 类适配器。通过继承实现
 * @author Hao Du
 * @version 1.0
 * @date 2021/6/12
 */
public class ClassAdaptor extends Adaptee implements Target {
    @Override
    public void targetRequest() {
        super.specificRequest();
    }
}
