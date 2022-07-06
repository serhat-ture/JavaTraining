package com.serhatcode.java101;

public class BreakContinue {
    public static void main(String[] args) {

        String[] names = {"Anna", "Ali", "Mike", "Bob"};
        for (String name : names) {

            if (name.equals("Mike")) {
                break;
            }
            //System.out.println(name);

         //f the condition is true loop will not execute following code
            //loop will continue for the next value
            if (name.startsWith("A")) {
                continue;
            }
            System.out.println(name);
        }
    }
}
