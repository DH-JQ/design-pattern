package org.hugh.creating.factory.factorymethod;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FactoryMap{
    private static Map<String, IFactory> cacheFactories = new ConcurrentHashMap<>();

    static {
        cacheFactories.put("A", new ConcreteFactoryA());
        cacheFactories.put("B", new ConcreteFactoryB());
    }

    public static IFactory getFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }

        return cacheFactories.get(type);
    }
}
