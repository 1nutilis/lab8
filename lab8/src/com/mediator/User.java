package com.mediator;

public class User extends Colleague{
    private String name;

    public User(IMediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    public void send(String message) {
        System.out.println(this.name + " отправляет сообщение: " + message);
        mediator.sendMessage(message, this);
    }

    public void sendTo(String message, Colleague receiver) {
        System.out.println(this.name + " отправляет приватное сообщение " + receiver.getName() + ": " + message);
        mediator.sendMessageTo(message, this, receiver);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " получил сообщение: " + message);
    }

    @Override
    public String getName() {
        return name;
    }
}
