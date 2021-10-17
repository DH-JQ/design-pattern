package org.hugh.creating.singleton;

/**
 * JVM层唯一、线程安全
 * 累加载时初始化对象
 * @author DH
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return instance;
    }

}
