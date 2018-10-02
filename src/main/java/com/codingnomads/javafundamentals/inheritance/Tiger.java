package com.codingnomads.javafundamentals.inheritance;

public class Tiger extends Animal {

    private String name;

    public Tiger(String name) {
        System.out.println("tiger Constructor " + name);
    }


    public void growl() {
        System.out.println("RAWR!");
    }

    public void eatAlot() {
        eat();
        super.eat();
    }

    @Override
    public void eat() {
        System.out.println("watsagsdga");
    }

}
