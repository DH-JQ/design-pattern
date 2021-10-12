package org.hugh.behavior.iterator;

/**
 * 容器接口
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/12
 */
public interface Collection<E> {
    /**
     * 创建迭代器，通过依赖注入的方式，构造函数传入容器对象
     *
     * @return 迭代器
     */
    Iterator<E> iterator();
}
