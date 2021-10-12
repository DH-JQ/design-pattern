package org.hugh.behavior.chain.linkchain;

/**
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/11
 */
public class HandlerA extends Handler {
    @Override
    public boolean doHandle() {
        boolean handled;
        // 处理逻辑
        handled = true;
        return handled;
    }
}
