package org.hugh.behavior.chain.linkchain;

/**
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/11
 */
public class HandlerChain {
    private Handler head;

    private Handler tail;

    public void addHandler(Handler handler) {
        if (handler == null) {
            throw new IllegalArgumentException("handler is null");
        }
        handler.setSuccessor(null);

        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }

        tail.setSuccessor(handler);
        tail = handler;
    }

    public void handle() {
        if (head != null) {
            head.handle();
        }
    }
}
