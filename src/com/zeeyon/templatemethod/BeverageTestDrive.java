package com.zeeyon.templatemethod;

public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\n차 준비중...");
        teaWithHook.prepareRecipe();

        System.out.println("\n커피 준비중...");
        coffeeWithHook.prepareRecipe();
    }
}
//차 준비중...
//물 끓이는 중
//차를 우려내는 중
//컵에 따르는 중
//차에 레몬을 넣어 드릴까요? (y/n) y
//레몬을 추가하는 중
//
//커피 준비중...
//물 끓이는 중
//필터를 통해서 커피를 우려내는 중
//컵에 따르는 중
//커피에 우유와 설탕을 넣어 드릴까요? (y/n) y
//설탕과 우유를 추가하는 중