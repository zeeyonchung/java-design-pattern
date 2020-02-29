package com.zeeyon.decorator;

public class DartRoast extends Beverage {

    public DartRoast() {
        description = "다크 로스트 커피";
    }

    @Override
    public double cost() {
        return .99;
    }
}
