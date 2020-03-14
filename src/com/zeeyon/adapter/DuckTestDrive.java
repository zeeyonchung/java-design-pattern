package com.zeeyon.adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
//The Turkey says...
//Gobble gobble
//I'm flying a short instance
//
//The Duck says...
//Quack
//I'm flying
//
//The TurkeyAdapter says...
//Gobble gobble
//I'm flying a short instance
//I'm flying a short instance
//I'm flying a short instance
//I'm flying a short instance
//I'm flying a short instance
