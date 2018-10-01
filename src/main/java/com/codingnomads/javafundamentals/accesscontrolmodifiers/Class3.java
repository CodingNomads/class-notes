package com.codingnomads.javafundamentals.accesscontrolmodifiers;


public class Class3 extends Class1 {

    public void print() {
        System.out.println(publicVariable);
        System.out.println(protectedVariable);
        protectedMethod();

    }
}
