package org.hugh.behavior.state;

/**
 * 状态动作接口，可根据进行细粒度拆分
 * 动作触发状态机状态转移
 * @author DH
 * @version 1.0
 * @date 2021/5/17
 */
public interface IState {
    /**
     * 获取状态名称
     * @return
     */
    State getName();

    /**
     * 获得蘑菇
     * @param machine
     */
    void obtainMushroom(StateMachine machine);

    /**
     * 获得火把
     * @param machine
     */
    void obtainFireFlower(StateMachine machine);

    /**
     * 获得斗篷
     * @param machine
     */
    void obtainCape(StateMachine machine);

    /**
     * 遇见怪物
     * @param machine
     */
    void meetMonster(StateMachine machine);
}
