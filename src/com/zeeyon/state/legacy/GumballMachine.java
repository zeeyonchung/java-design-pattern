package com.zeeyon.state.legacy;

public class GumballMachine {

    private enum GumballMachineState {
        SOLD_OUT,
        NO_QUARTER,
        HAS_QUARTER,
        SOLD
    }

    private GumballMachineState state = GumballMachineState.SOLD_OUT;
    private int count;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = GumballMachineState.NO_QUARTER;
        }
    }

    /**
     * 동전 투입
     */
    public void insertQuarter() {
        switch (state) {
            case SOLD_OUT:
                System.out.println("매진되었습니다. 다음 기회에 이용해주세요.");
                break;

            case NO_QUARTER:
                System.out.println("동전을 넣으셨습니다.");
                state = GumballMachineState.HAS_QUARTER;
                break;

            case HAS_QUARTER:
                System.out.println("동전은 한 개만 넣어주세요.");
                break;

            case SOLD:
                System.out.println("잠깐만 기다려 주세요. 알맹이가 나가고 있습니다.");
                break;
        }
    }

    /**
     * 동전 반환
     */
    public void ejectQuarter() {
        switch (state) {
            case SOLD_OUT:
                System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
                break;

            case NO_QUARTER:
                System.out.println("동전을 넣어주세요.");
                break;

            case HAS_QUARTER:
                System.out.println("동전이 반환됩니다.");
                state = GumballMachineState.NO_QUARTER;
                break;

            case SOLD:
                System.out.println("이미 알맹이를 뽑으셨습니다.");
                break;
        }
    }

    /**
     * 손잡이 돌림
     */
    public void turnCrank() {
        switch (state) {
            case SOLD_OUT:
                System.out.println("매진되었습니다.");
                break;

            case NO_QUARTER:
                System.out.println("동전을 넣어주세요.");
                break;

            case HAS_QUARTER:
                System.out.println("손잡이를 돌리셨습니다.");
                state = GumballMachineState.SOLD;
                dispense();
                break;

            case SOLD:
                System.out.println("손잡이는 한 번만 돌려주세요.");
                break;
        }
    }

    /**
     * 알맹이 꺼내기
     */
    public void dispense() {
        switch (state) {
            case SOLD_OUT:
                System.out.println("매진되었습니다.");
                break;

            case NO_QUARTER:
                System.out.println("동전을 넣어주세요.");
                break;

            case HAS_QUARTER:
                System.out.println("알맹이가 나갈 수 없습니다.");
                break;

            case SOLD:
                System.out.println("알맹이가 나가고 있습니다.");
                count = count - 1;
                if (count == 0) {
                    state = GumballMachineState.SOLD_OUT;
                } else {
                    state = GumballMachineState.NO_QUARTER;
                }
                break;
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
