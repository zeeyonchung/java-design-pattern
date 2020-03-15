package com.zeeyon.templatemethod;

public class Tea extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("차를 우려내는 중");
    }

    @Override
    protected void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }
}
