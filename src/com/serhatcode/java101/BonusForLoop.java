package com.serhatcode.java101;

import java.util.Arrays;

public class BonusForLoop {
    public static void main(String[] args) {

        int[] numbers = {2, 0, 4, 100};
        String[] names = {"Ali", "Anna"};

        //// just write  (numbers.for) you see option and then enter
        for (int i = 0; i < numbers.length; i++) {
        }

        //or more advance option -----COOOOOOLLLLLL
        Arrays.stream(numbers).forEach(System.out::println);

         // just write  (names.for) you see option and then enter
            for (String name : names) {
            }
         //or more advance option-----COOOOOOLLLLLL
        Arrays.stream(names).forEach(System.out::println);


    }
}
