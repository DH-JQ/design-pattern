package org.hugh.behavior.iterator;

/**
 * 迭代器接口
 * 两种实现方式：
 * 1. next()方法移动游标并返回下一个对象。
 * 2. next()方法只移动游标，返回布尔值
 *
 * @author Hao Du
 * @version 1.0
 * @date 2021/6/12
 */
public interface Iterator<E> {
    /**
     * 判断游标处是否有对象
     * @return 布尔值
     */
    boolean hasNext();

    /**
     * 返回游标指向的对象，并将游标向后移动1位
     *
     * 注意：调用该方法前，需要调用hasNext方法判断，否则会抛出NoSuchElementException
     * @return 布尔值
     */
    E next();

    /**
     *
     * @return 游标指向的值
     */
    E currentItem();
}
