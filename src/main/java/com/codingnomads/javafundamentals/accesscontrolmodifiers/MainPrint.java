package com.codingnomads.javafundamentals.accesscontrolmodifiers;


import com.codingnomads.javafundamentals.accesscontrolmodifiers.package1.Class1;
import com.codingnomads.javafundamentals.accesscontrolmodifiers.package1.Class2;
import com.codingnomads.javafundamentals.accesscontrolmodifiers.package2.Class3;

public class MainPrint {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.print();

        Class2 class2 = new Class2();
        class2.print();

        Class3 class3 = new Class3();
        class3.print();
    }
}
