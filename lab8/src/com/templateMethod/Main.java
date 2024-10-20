package com.templateMethod;

public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        System.out.println("Приготовление чая:");
        tea.prepareRecipe();

        System.out.println();

        Beverage coffee = new Coffee();
        System.out.println("Приготовление кофе:");
        coffee.prepareRecipe();
    }
}