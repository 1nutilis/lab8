package com.command;

public class Main {
    public static void main(String[] args) {

        Light livingRoomLight = new Light();
        Television tv = new Television();


        ICommand lightOn = new LightOnCommand(livingRoomLight);
        ICommand lightOff = new LightOffCommand(livingRoomLight);


        ICommand tvOn = new TelevisionOnCommand(tv);
        ICommand tvOff = new TelevisionOffCommand(tv);


        RemoteControl remote = new RemoteControl();


        remote.setCommands(lightOn, lightOff);
        System.out.println("Управление светом:");
        remote.pressOnButton();
        remote.pressOffButton();
        remote.pressUndoButton();


        remote.setCommands(tvOn, tvOff);
        System.out.println("Управление телевизором:");
        remote.pressOnButton();
        remote.pressOffButton();
    }
}
