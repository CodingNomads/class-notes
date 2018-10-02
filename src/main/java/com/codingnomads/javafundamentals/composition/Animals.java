package com.codingnomads.javafundamentals.composition;

public class Animals {


    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat =  new Cat();
        Tiger tiger = new Tiger();

        dog.eat();
        cat.eat();
        tiger.eat();
    }
}
