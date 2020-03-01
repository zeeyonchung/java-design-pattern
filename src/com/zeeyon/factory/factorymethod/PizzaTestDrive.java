package com.zeeyon.factory.factorymethod;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("ordered a " + pizza.getName());
    }
}
