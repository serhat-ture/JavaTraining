package com.serhatcode.java101;

public class DifferencePrimitiveAndReference {
    public static void main(String[] args) {

        int a = 10;
        int b = a;
        a= 100;
        // a changed value to 100, but b still value is 10.
        //because b lives in different memory address.
        int sum = a+b;

        System.out.println("a + b =" + sum);

        Person alex = new Person("alex");
        Person mariam = alex;

        System.out.println("before changing alex");
        System.out.println(alex.name + " "+ mariam.name);

        alex.name= "Alexander";

        System.out.println("after changing alex");
        System.out.println(alex.name + " "+ mariam.name);

        // if we change name as a mariam
        //  they are pointing to the same reference
        mariam.name= "Mariam";

        System.out.println("afterrrr changing alex");
        System.out.println(alex.name + " "+ mariam.name);

    }
    static class Person{

        String name;
        Person (String name){
            this.name =name;
        }
    }
}
