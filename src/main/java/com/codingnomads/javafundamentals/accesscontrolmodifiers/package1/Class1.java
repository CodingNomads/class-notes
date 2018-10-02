package com.codingnomads.javafundamentals.accesscontrolmodifiers.package1;

public class Class1 {

    public String publicVariable = "publicVariable";
    protected String protectedVariable = "protectedVariable";
    String defaultVariable = "defaultVariable";
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
