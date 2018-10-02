package com.codingnomads.javafundamentals.accesscontrolmodifiers.package1;

public class Class2 {

    public void print() {
        Class1 class1 = new Class1();
        System.out.println(class1.publicVariable);
        System.out.println(class1.protectedVariable);
        System.out.println(class1.defaultVariable);
    }
}
