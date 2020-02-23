package com.zeeyon.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack(); // 꽥!
        mallard.performFly(); // 날고 있어요!

        Duck model = new ModelDuck();
        model.performFly(); // 저는 못 날아요...
        model.setFlyBefavior(new FlyRocketPowered());
        model.performFly(); // 로켓 추진으로 날아갑니다
    }
}
