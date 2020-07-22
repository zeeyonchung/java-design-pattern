package com.zeeyon.visitor;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {

    public static void main(String[] args) {
        Visitor visitor = new VisitorA();
        List<Visitable> visitables = new ArrayList<>();

        visitables.add(new VisitableA(1));
        visitables.add(new VisitableA(2));
        visitables.add(new VisitableA(3));
        visitables.add(new VisitableA(4));

        for (Visitable visitable : visitables) {
            visitable.accept(visitor);
        }

        System.out.println(((VisitorA) visitor).getAgeSum()); //10
    }
}
