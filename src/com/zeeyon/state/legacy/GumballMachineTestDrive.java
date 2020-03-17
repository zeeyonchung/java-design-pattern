package com.zeeyon.state.legacy;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(5);
        System.out.println(machine);    //umballMachine{state=NO_QUARTER, count=5}

        machine.insertQuarter();        //동전을 넣으셨습니다.
        machine.turnCrank();            //손잡이를 돌리셨습니다. 알맹이가 나가고 있습니다.
        System.out.println(machine);    //GumballMachine{state=NO_QUARTER, count=4}

        machine.insertQuarter();        //동전을 넣으셨습니다.
        machine.ejectQuarter();         //동전이 반환됩니다.
        machine.turnCrank();            //동전을 넣어주세요.
        System.out.println(machine);    //GumballMachine{state=NO_QUARTER, count=4}

        machine.insertQuarter();        //동전을 넣으셨습니다.
        machine.turnCrank();            //손잡이를 돌리셨습니다. 알맹이가 나가고 있습니다.
        machine.insertQuarter();        //동전을 넣으셨습니다.
        machine.turnCrank();            //손잡이를 돌리셨습니다. 알맹이가 나가고 있습니다.
        machine.ejectQuarter();         //동전을 넣어주세요.
        System.out.println(machine);    //GumballMachine{state=NO_QUARTER, count=2}

        machine.insertQuarter();        //동전을 넣으셨습니다.
        machine.insertQuarter();        //동전은 한 개만 넣어주세요.
        machine.turnCrank();            //손잡이를 돌리셨습니다. 알맹이가 나가고 있습니다.
        machine.insertQuarter();        //동전을 넣으셨습니다.
        machine.turnCrank();            //손잡이를 돌리셨습니다. 알맹이가 나가고 있습니다.
        machine.insertQuarter();        //매진되었습니다. 다음 기회에 이용해주세요.
        machine.turnCrank();            //매진되었습니다.
        System.out.println(machine);    //GumballMachine{state=SOLD_OUT, count=0}
    }
}
