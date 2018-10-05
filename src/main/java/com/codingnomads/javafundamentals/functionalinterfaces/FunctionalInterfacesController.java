package com.codingnomads.javafundamentals.functionalinterfaces;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesController {

    public static void main(String[] args) {
        useConsumer();
        useSupplier();
        useFunction();
        usePredicate();
    }

    private static void useConsumer() {
        Consumer<String> consumerAsAnonymousClass = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        Consumer<String> consumer = input -> System.out.println("The consumer consumed: " + input);
        consumer.accept("an apple");
    }

    private static void useSupplier() {
        Supplier<Integer> supplierAsAnonymousClass = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt();
            }
        };
        Supplier<Integer> randomIntegerSupplier = () -> new Random().nextInt();
        Integer supplierResult = randomIntegerSupplier.get();
        System.out.println("The supplier returned: " + supplierResult);
    }

    private static void useFunction() {
        Function<String, Integer> functionAsAnonymousClass = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return new Integer(s);
            }
        };
        Function<String, Integer> stringToIntegerFunction = string -> new Integer(string);
        Integer functionResult = stringToIntegerFunction.apply("2");
        System.out.println("The function returned: " + functionResult);
    }

    private static void usePredicate() {
        Predicate<String> predicateAsAnonymousClass = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("Java");
            }
        };
        Predicate<String> javaTestingPredicate = s -> s.equals("Java");
        boolean testResult = javaTestingPredicate.test("C#");
        System.out.println("The predicated test result is: " + testResult);
    }
}
