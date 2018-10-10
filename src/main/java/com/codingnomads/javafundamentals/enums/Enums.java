package com.codingnomads.javafundamentals.enums;

public class Enums {

    private static final String MONDAY = "MONDAY";

    public static void main(String[] args) {
        Days monday = Days.MONDAY;


        Days[] values = Days.values();
        for (Days value : values) {
            System.out.println(value);
        }
        Days monday1 = Days.valueOf("MONDAY");
        System.out.println(monday1.getClass().getName());
        System.out.println(monday1);
        System.out.println("ordinal: " + Days.MONDAY.ordinal());

        System.out.println(Days.values()[0]);


        Days[] myDays = new Days[5];
        myDays[0] = Days.MONDAY;
        myDays[1] = Days.TUESDAY;
        myDays[2] = Days.WEDNESDAY;

    }


}
