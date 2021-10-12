package org.hugh.behavior.chain.listchain;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用数组存储处理器
 *
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/11
 */
public class HandlerChain {
    private final List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        handlers.add(handler);
    }

    public void applyHandle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (!handled) {
                break;
            }
        }
    }
}
