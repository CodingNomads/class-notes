package com.codingnomads.javafundamentals.functionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesController {

    public static void main(String[] args) {

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello");

        Supplier<String> supplier = () -> "new String!";
        String supplierResult = supplier.get();

        Function<String, Integer> function = string -> new Integer(string);
        Integer functionResult = function.apply("2");

        Predicate<String> predicate = s -> s.equals("Java");
        boolean testResult = predicate.test("C#");

    }
}
