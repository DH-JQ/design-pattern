package org.hugh.structural.adaptor;

/**
 * 对象适配器，通过组合实现
 * @author Hao Du
 * @version 1.0
 * @date 2021/6/12
 */
public class ObjectAdaptor implements Target{

    private Adaptee adaptee;

    public ObjectAdaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void targetRequest() {
        this.adaptee.specificRequest();
    }
}
