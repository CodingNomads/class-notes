package com.codingnomads.javafundamentals.composition;

public class Cat {

    private Apetite apetite = new Apetite();

    public void meow() {
        System.out.println("Meow!");
    }

    public void eat() {
        apetite.eat();
    }


}