package com.smluo.strategy;

/**
 * 飞行行为接口（飞行算法族）
 */
public interface FlyBehavior {
    public void fly();
}

/**
 * 可以飞行（飞行算法具体实现）
 */
class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("i'm flying");
    }
}

/**
 * 不能飞行（飞行算法具体实现）
 */
class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i can't fly");
    }
}

/**
 * 借助火箭实现飞行（飞行算法具体实现）
 */
class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("i'm flying with a rocket ");
    }
}