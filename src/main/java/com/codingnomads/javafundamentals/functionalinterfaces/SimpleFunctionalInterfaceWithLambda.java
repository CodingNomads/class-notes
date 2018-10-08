package com.codingnomads.javafundamentals.functionalinterfaces;

public class SimpleFunctionalInterfaceWithLambda {
    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutor();
        Command theLambdaContainingDoingJob = () -> System.out.println("doing job");
        commandExecutor.command(theLambdaContainingDoingJob);
        commandExecutor.command(theLambdaContainingDoingJob);

        commandExecutor.command(() -> System.out.println("commanding!"));
    }
}

class CommandExecutor {
    public void command(Command command){
        command.execute();
    }
}

@FunctionalInterface
interface Command{
    void execute();
}