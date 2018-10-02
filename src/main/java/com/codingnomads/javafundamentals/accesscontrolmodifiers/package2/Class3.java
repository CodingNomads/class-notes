package com.codingnomads.javafundamentals.accesscontrolmodifiers.package2;


import com.codingnomads.javafundamentals.accesscontrolmodifiers.package1.Class1;

public class Class3 extends Class1 {

    public Class3() {
    }

    public void print() {

        System.out.println(publicVariable);
        System.out.println(protectedVariable);
        protectedMethod();

    }
}
