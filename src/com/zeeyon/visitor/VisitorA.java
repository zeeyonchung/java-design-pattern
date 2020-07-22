package com.zeeyon.visitor;

public class VisitorA implements Visitor {

    private int ageSum;

    public int getAgeSum() {
        return ageSum;
    }

    @Override
    public void visit(Visitable visitable) {
        if (visitable instanceof VisitableA) {
            int age = ((VisitableA) visitable).getAge();
            ageSum += age;
            // ...
        } else {
            // ...
        }
    }
}
