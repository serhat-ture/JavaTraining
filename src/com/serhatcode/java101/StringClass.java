package com.serhatcode.java101;

public class StringClass {
    public static void main(String[] args) {
        //String

        String name = new String("serhatcode");
        // we can write String name ="serhatcode";
        //The new keyword creates new objects.
        // name is object
        // toUpperCase() is method
        //charAt() is a method
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(1));
        // or
        String code = new String("code");
        System.out.println(name.contains(code));
        System.out.println(name.equals(code));
    }
}
