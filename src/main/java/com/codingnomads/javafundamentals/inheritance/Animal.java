package com.codingnomads.javafundamentals.inheritance;

public class Animal {

    public Animal(){
        System.out.println("default constructor from animal");
    }

    public Animal(String name) {
        System.out.println("animal Constructor - " + name);
    }

    public void eat(){
        System.out.println("Nom Nom");
    }
}
