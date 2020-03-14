package com.zeeyon.command.slot;

public class Stereo {

    private int volume;

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCD() {
        System.out.println("Play with CD");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
