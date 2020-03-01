package com.zeeyon.factory.factorymethod;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // 팩토리 역할을 하는 메서드
    // 추상 클래스로 선언하여 서브클래스에서 객체 생성을 책임지도록 한다.
    // 팩토리 메서드에서는 특정 객체를 리턴하며, 그 객체는 보통 수퍼클래스에서 정의한 메소드 내에서 쓰이게 된다.
    protected abstract Pizza createPizza(String type);
}
