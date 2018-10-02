package com.codingnomads.javafundamentals.composition;

public class Dog {

    private Apetite apetite = new Apetite();



    public void bark() {
        System.out.println("woof woof");
    }


    public void eat() {
        apetite.eat();
    }

}
