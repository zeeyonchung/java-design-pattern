package com.zeeyon.command;

public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    @Override
    public void execute() {
        garageDoor.open();
    }
}
