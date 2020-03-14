package com.zeeyon.command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRepoteControl remote = new SimpleRepoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
