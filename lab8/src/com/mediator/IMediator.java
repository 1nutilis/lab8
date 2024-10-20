package com.mediator;

public interface IMediator {
    void sendMessage(String message, Colleague colleague);
    void sendMessageTo(String message, Colleague sender, Colleague receiver);
}
