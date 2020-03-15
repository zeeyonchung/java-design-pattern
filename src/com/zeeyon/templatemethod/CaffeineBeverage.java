package com.zeeyon.templatemethod;

public abstract class CaffeineBeverage {

    // 서브클래스에서 알고리즘의 각 단계를 마음대로 건드리는 것을 방지하기 위해 final로 선언한다.
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // 각 메서드는 알고리즘의 각 단계를 구현한다.

    protected abstract void brew();
    protected abstract void addCondiments();

    private void boilWater() {
        System.out.println("물 끓이는 중");
    }

    private void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    // 후크 메서드
    // 서브클래스에서 필요에 따라 오버라이드 할 수도, 무시할 수도 있는 메서드
    boolean customerWantsCondiments() {
        // 기본적인 내용만 구현되어 있거나 아무 코드도 들어있지 않다.
        return true;
    }
}
