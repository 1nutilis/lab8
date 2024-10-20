package com.templateMethod;

public class Coffee extends Beverage{
    protected void brew() {
        System.out.println("Заваривание кофе...");
    }

    protected void addCondiments() {
        System.out.println("Добавление сахара и молока...");
    }
}
