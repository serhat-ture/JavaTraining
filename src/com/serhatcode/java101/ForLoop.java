package com.serhatcode.java101;

public class ForLoop {
    public static void main(String[] args) {

        int[] numbers = {2, 0, 4, 100};
        String[] names = {"Ali", "Anna"};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Enhanced for loop");
        // Enhanced loop doing the same thing and
        // do not give you access the index
        //// for each loop
        for (int number : numbers) {
            System.out.println(number);
            //or
            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}
