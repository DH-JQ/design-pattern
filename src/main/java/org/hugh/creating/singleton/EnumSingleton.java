package org.hugh.creating.singleton;

import java.util.concurrent.atomic.AtomicInteger;


// 自动
// private static final INSTANCE("Mon");
// private String date;
// 构造函数，private，属性赋值是给了INSTANCE
// private EnumSingleton(String date) {
//      this.date = date;
// }


public enum EnumSingleton {
    INSTANCE();

    private AtomicInteger idGenerator = new AtomicInteger();

    public long getId() {
        return idGenerator.getAndIncrement();
    }
}
