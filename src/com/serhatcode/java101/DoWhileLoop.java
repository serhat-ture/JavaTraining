package com.serhatcode.java101;

public class DoWhileLoop {
    public static void main(String[] args) {

        int count = 21;
        do {
            System.out.println( count);
            count++;
        }

        // do while execute no matter what, at least once. even if while condition false
        //output 21
        //while loop output should be nothing
        while (count <= 20) ;

    }
}