package com.zeeyon.command;

public class SimpleRepoteControl {
    Command slot;

    public SimpleRepoteControl() {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
