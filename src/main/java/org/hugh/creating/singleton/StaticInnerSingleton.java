package org.hugh.creating.singleton;

public class StaticInnerSingleton {

    private static class SingletonHolder {
        private static final StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    private StaticInnerSingleton(){}

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.instance;
    }

}
