package org.hugh.behavior.state;

/**
 * FSM状态机，根据事件触发状态转移
 * @author DH
 * @version 1.0
 * @date 2021/5/17
 */
public class StateMachine{
    private int score;
    private IState currentState;

    // 使用map初始化IState
    // public final Map<State, IState> stateMap = new HashMap<>(4);

    // public StateMachine() {
    //     stateMap.put(State.SMALL, new SmallMario());
    //     stateMap.put(State.SUPER, new SuperMario());
    //
    //     currentState = stateMap.get(State.SMALL);
    //     score = 0;
    // }

    public StateMachine() {
        currentState = SmallMario.getInstance();
        score = 0;
    }



    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public IState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(IState currentState) {
        this.currentState = currentState;
    }

    public void obtainMushroom() {
        currentState.obtainMushroom(this);
    }

    public void obtainFireFlower() {
        currentState.obtainFireFlower(this);
    }

    public void obtainCape() {
        currentState.obtainCape(this);
    }

    public void meetMonster() {
        currentState.meetMonster(this);
    }
}
