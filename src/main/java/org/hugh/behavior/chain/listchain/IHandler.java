package org.hugh.behavior.chain.listchain;

/**
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/11
 */
public interface IHandler {

    /**
     * 处理方法
     * @return true，处理成功；false，处理失败
     */
    boolean handle();
}
