package com.codingnomads.javafundamentals.composition;

public class Tiger {

    private Apetite apetite = new Apetite();


    public void growl() {
        System.out.println("RAWR!");
    }

    public void eat() {
        apetite.eat();
    }

}
