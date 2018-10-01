package com.codingnomads.javafundamentals.accesscontrolmodifiers;

public class Class1 {

    public String publicVariable = "publicVariable";
    String defaultVariable = "defaultVariable";
    protected String protectedVariable = "protectedVariable";
    private String privateVariable = "privateVariable";

    public void print() {
        System.out.println(privateVariable);
        System.out.println(publicVariable);
        System.out.println(protectedVariable);
        System.out.println(defaultVariable);
    }
    protected void protectedMethod(){
        System.out.println("protected method");
    }
}
