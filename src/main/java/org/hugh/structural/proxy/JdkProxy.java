package org.hugh.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 被代理对象必须有接口
 *
 * @author Hao Du
 * @version 1.0
 * @date 2021/6/12
 */
public class JdkProxy<T> implements InvocationHandler{
    private final T target;

    public JdkProxy(T target) {
        this.target = target;
    }

    public Object proxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 参数增加
        // 执行过程增强
        // 返回值增加
        return method.invoke(target, args);
    }
}
