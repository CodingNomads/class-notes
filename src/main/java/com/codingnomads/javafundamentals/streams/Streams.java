package com.codingnomads.javafundamentals.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("andy", "andrea", "mike");

        for (String name : names) {
            //    System.out.println(name);
        }

        Stream<String> stream1 = Arrays.asList("andy", "andrea", "mike").stream();


        //stream.forEach(name -> System.out.println(name));
        OptionalInt optionalResult = IntStream.of().min();
        System.out.println(optionalResult.orElse(0));


        Stream.of("andy", "andrea", "mike")
                .filter(s -> s.equals("andy"))
                .map(s -> s.toUpperCase())
                .map(s -> s + "1")
                .map(s -> s + "2")
                .map(s -> s + "3")
                .map(s -> s + "4")
                .forEach(s -> System.out.println(s));

    }
}
