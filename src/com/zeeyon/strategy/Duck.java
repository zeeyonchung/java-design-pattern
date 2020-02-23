package com.zeeyon.strategy;

public abstract class Duck {

    // 행동 인터페이스 형식의 레퍼런스 변수
    // 모든 서브클래스에서 이 변수를 상속 받는다.
    FlyBehavior flyBefavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    public abstract void display();

    public void performFly() {
        // 행동 클래스에 위임한다.
        flyBefavior.fly();
    }

    public void performQuack() {
        // 행동 클래스에 위임한다.
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("모든 오리는 수영을 한다. 가짜 오리도 수영을 한다.");
    }

    // 동적으로 행동을 지정하기
    // 오리의 행동을 즉석에서 바꾸고 싶으면 언제든지 아래 두 메서드를 호출하면 된다.
    public void setFlyBefavior(FlyBehavior fb) {
        flyBefavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
