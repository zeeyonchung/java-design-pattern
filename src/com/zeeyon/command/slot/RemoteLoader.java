package com.zeeyon.command.slot;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenRoomLight = new Light("Kitchen");
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenRoomLight);
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenRoomLight);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
        remoteControl.setCommand(2, stereoOnCommand, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
    }
}
//------ Remote Control ------
//[slot 0]com.zeeyon.command.slot.LightOnCommand   com.zeeyon.command.slot.LightOffCommand
//[slot 1]com.zeeyon.command.slot.LightOnCommand   com.zeeyon.command.slot.LightOffCommand
//[slot 2]com.zeeyon.command.slot.StereoOnCommand   com.zeeyon.command.slot.StereoOffCommand
//[slot 3]com.zeeyon.command.slot.NoCommand   com.zeeyon.command.slot.NoCommand
//[slot 4]com.zeeyon.command.slot.NoCommand   com.zeeyon.command.slot.NoCommand
//[slot 5]com.zeeyon.command.slot.NoCommand   com.zeeyon.command.slot.NoCommand
//[slot 6]com.zeeyon.command.slot.NoCommand   com.zeeyon.command.slot.NoCommand
//
//Living Room Light is on
//Living Room Light is off
//Kitchen Light is on
//Kitchen Light is off
//Stereo is on
//Play with CD
//Stereo is off
//Stereo is on
