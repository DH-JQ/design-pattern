package org.hugh.creating.singleton;

/**
 * 静态内部类
 *
 * JVM层面唯一、保证线程安全
 */
public class StaticInnerSingleton {

    private static class SingletonHolder {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    private StaticInnerSingleton(){}

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
