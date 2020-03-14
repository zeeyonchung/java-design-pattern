package com.zeeyon.command.slot;

public interface Command {
    void execute();
    void undo();

//    로그 기록
//    void store();
//    void load();
}
