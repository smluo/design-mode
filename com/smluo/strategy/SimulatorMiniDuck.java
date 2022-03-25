package com.smluo.strategy;

/**
 * 策略模式
 */
public class SimulatorMiniDuck {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        /**
         * 模型鸭默认是不会飞的,通过调用鸭子的setter方法，可以动态的改变模型鸭的飞行行为来实现飞行
         */
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
