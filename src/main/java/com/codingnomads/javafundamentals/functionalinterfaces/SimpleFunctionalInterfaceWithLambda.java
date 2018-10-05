package com.codingnomads.javafundamentals.functionalinterfaces;

public class SimpleFunctionalInterfaceWithLambda {
    public static void main(String[] args) {
        new Comander().command(() -> System.out.println("doing job"));
    }
}

class Comander{
    public void command(Command command){
        command.execute();
    }
}

@FunctionalInterface
interface Command{
    void execute();
}