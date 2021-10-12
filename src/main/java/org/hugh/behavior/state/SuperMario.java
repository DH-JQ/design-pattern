package org.hugh.behavior.state;

/**
 * @author DH
 * @version 1.0
 * @date 2021/5/17
 */
public class SuperMario implements IState{
    public final static IState INSTANCE = new SuperMario();
    private SuperMario() {}
    public static IState getInstance() {
        return INSTANCE;
    }

    @Override
    public State getName() {
        return State.SUPER;
    }

    @Override
    public void obtainMushroom(StateMachine machine) {

    }

    @Override
    public void obtainFireFlower(StateMachine machine) {

    }

    @Override
    public void obtainCape(StateMachine machine) {

    }

    @Override
    public void meetMonster(StateMachine machine) {

    }
}
