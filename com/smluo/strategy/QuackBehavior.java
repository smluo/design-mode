package com.smluo.strategy;

/**
 * 叫声行为接口（算法族）
 */
public interface QuackBehavior {
    public void quack();
}

/**
 * 呱呱叫（叫声行为接口的实现）
 */
class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

/**
 * 不会叫（叫声行为接口的实现）
 */
class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

/**
 * 吱吱叫（叫声行为接口的实现）
 */
class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

