package com.codingnomads.javafundamentals.functionalinterfaces;

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

    private static void usePredicate() {
        Predicate<String> predicateAsAnonymousClass = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("Java");
            }
        };
        Predicate<String> predicate = s -> s.equals("Java");
        boolean testResult = predicate.test("C#");
        System.out.println(testResult);
    }

    private static void useFunction() {
        Function<String, Integer> functionAsAnonymousClass = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return new Integer(s);
            }
        };
        Function<String, Integer> function = string -> new Integer(string);
        Integer functionResult = function.apply("2");
        System.out.println("The function returned: " + functionResult);
    }

    private static void useSupplier() {
        Supplier<String> supplierAsAnonymousClass = new Supplier<String>() {
            @Override
            public String get() {
                return "new String!";
            }
        };
        Supplier<String> supplier = () -> "new String!";
        String supplierResult = supplier.get();
    }

    private static void useConsumer() {
        Consumer<String> consumerAsAnonymousClass = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        Consumer<String> consumer = input -> System.out.println(input);
        consumer.accept("Hello");
    }
}
