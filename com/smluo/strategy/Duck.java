package com.smluo.strategy;

/**
 * 鸭子（抽象类）
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qc) {
        quackBehavior = qc;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}

/**
 * 绿头鸭（鸭子抽象类的具体实现），特点：会飞，会呱呱叫
 */
class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("i'm a real mallard duck");
    }
}

/**
 * 模型鸭（鸭子抽象类的具体实现），特点：不会飞，会吱吱叫
 */
class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("i'm a model duck");
    }
}
