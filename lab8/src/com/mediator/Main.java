package com.mediator;

public class Main {
    public static void main(String[] args) {

        ChatMediator chatMediator = new ChatMediator();


        User alisa = new User(chatMediator, "Алиса");
        User bob = new User(chatMediator, "Боб");
        User semen = new User(chatMediator, "Семен");


        chatMediator.registerColleague(alisa);
        chatMediator.registerColleague(bob);
        chatMediator.registerColleague(semen);


        alisa.send("Привет всем!");


        bob.send("Привет, Алиса!");


        semen.send("Всем привет!");


        bob.sendTo("Как дела, Алиса?", alisa);
    }
}
