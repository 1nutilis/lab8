package com.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IMediator {
    private List<Colleague> colleagues;

    public ChatMediator() {
        colleagues = new ArrayList<>();
    }

    public void registerColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    // Отправка всем участникам, кроме отправителя
    public void sendMessage(String message, Colleague sender) {
        for (Colleague colleague : colleagues) {
            if (colleague != sender) {
                colleague.receiveMessage(message);
            }
        }
    }

    // Отправка конкретному получателю
    public void sendMessageTo(String message, Colleague sender, Colleague receiver) {
        if (receiver != sender) {
            receiver.receiveMessage(message);
        }
    }
}