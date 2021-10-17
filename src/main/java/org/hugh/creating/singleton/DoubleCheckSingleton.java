package org.hugh.creating.singleton;

/**
 * @author DH
 */
public class DoubleCheckSingleton {

    /**
     * 要使用volatile，保证内存可见，解决java对象创建的指令重排序问题
     */
    private static volatile DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getInstance() {
        // 第一次检验，未创建时多个线程都能通过，创建后都不能通过
        if (instance == null) {
            // 未创建时都会请求类锁，后面再请求时不用锁
            synchronized (DoubleCheckSingleton.class) {
                // 第二次检验，解决第一次创建时的并发问题
                if (instance == null) {
                    // volatile用于解决对象指令重排序问题
                    // JVM创建对象：申请内存、对象初始化、应用赋值
                    // 使用volatile后，保证对象完全创建后才赋值
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
