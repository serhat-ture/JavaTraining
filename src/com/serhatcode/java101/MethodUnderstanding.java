package com.serhatcode.java101;

public class MethodUnderstanding {
    public static void main(String[] args) {

    //public means accessible by other classes.
    // method = a block of code that is executed whenever it is called upon

    int x = 3;
    int y = 4;

    // call the method
    int z = add(x,y);

		System.out.println(z);
}
    // our code has to return, so, int is return type, do not need  write void.

    // create a method
    static int add(int x, int y) {

        int z = x + y;
        // return statement
        return z;

    }
}
