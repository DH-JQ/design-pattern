package org.hugh.structural.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 被代理对象必须是类
 *
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/10
 */
public class CglibProxy<T> implements MethodInterceptor {

    private final T target;

    public CglibProxy(T target) {
        this.target = target;
    }

    public Object proxy() {
        return Enhancer.create(target.getClass(), this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        // 参数增加
        // 执行过程增强
        // 返回值增加
        return method.invoke(target, args);
    }
}
