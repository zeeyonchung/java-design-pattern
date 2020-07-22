package com.zeeyon.visitor;

public class VisitableA implements Visitable {

    private int age;

    public VisitableA(int age) {
        this.age = age;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getAge() {
        return age;
    }
}
