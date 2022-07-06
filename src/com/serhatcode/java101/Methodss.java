package com.serhatcode.java101;

public class Methodss {
    public static void main(String[] args) {

        // SIMPLY println is method
        String brand = "Samsung";
        System.out.println(brand.toUpperCase());
        System.out.println(brand.startsWith("S"));

        String name = "Bro";
        int age = 21;
        hello(name, age);
        // We need matching argument and parameters, if we call hello method
        //argument ==> (name) ,   parameter ==> (String name)
    }

    static void hello(String name, int age){
        System.out.println("Hello "+ name);
        System.out.println("You are "+ age);
    }
}
