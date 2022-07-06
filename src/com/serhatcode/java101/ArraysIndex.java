package com.serhatcode.java101;

public class ArraysIndex {
    public static void main(String[] args) {

        int[]numberss = {2,0,1,4,100,4,90,78};
        int oneHundred = numberss[4];

        //put (-1), if u want which number in array
        int lastOne = numberss[numberss.length -1];
        System.out.println(oneHundred);
        System.out.println(lastOne);


        double[] numbers = {10.2, 20, 11.1, 21, 31, 12, 22.5, 32, 42, 13.6, 23, 32, 43.3, 53, 14, 24, 34, 44, 54, 64, 15.1, 25, 35, 45, 55, 65.3, 75.4, 16, 26, 17.5,};
        double firstNumber= numbers[0];
        double lastNumber = numbers[numbers.length-1];
        System.out.println("firstNum = "+ firstNumber);
        System.out.println("lastNum = "+ lastNumber);

    }
}
