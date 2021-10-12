package org.hugh.behavior.chain.linkchain;

/**
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/11
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public boolean handle() {
        boolean handled = doHandle();
        if (successor != null && handled) {
            return successor.handle();
        }
        return handled;
    }

    /**
     * 具体的处理方法，交给子类实现
     * @return 处理成功，true；失败，false
     */
    public abstract boolean doHandle();
}
