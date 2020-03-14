package com.zeeyon.adapter;

/**
 * 어댑터는 타겟 인터페이스를 구현하며 어댑티 인스턴스가 들어있다.
 * 클라이언트와 어댑티는 서로에 대해서 모른다.
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
