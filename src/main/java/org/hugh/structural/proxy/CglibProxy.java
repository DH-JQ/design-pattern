package org.hugh.structural.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 被代理对象必须是类
 *
 * CGLib 的调用流程就是通过调用拦截器的 intercept 方法来实现对被代理类的调用。
 * 而拦截逻辑可以写在 intercept 方法的 invokeSuper(o, objects);的前后实现拦截
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
        // 设置父类为实例类、回调方法
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
