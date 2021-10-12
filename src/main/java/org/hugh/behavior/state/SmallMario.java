package org.hugh.behavior.state;

/**
 * @author DH
 * @version 1.0
 * @date 2021/5/17
 */
public class SmallMario implements IState{
    private final static IState INSTANCE = new SmallMario();

    private SmallMario() {}

    public static IState getInstance() {
        return INSTANCE;
    }

    @Override
    public State getName() {
        return State.SMALL;
    }

    @Override
    public void obtainMushroom(StateMachine machine) {
        machine.setScore(machine.getScore() + 100);
        machine.setCurrentState(SuperMario.getInstance());
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
