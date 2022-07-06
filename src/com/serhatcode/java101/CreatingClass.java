package com.serhatcode.java101;

public class CreatingClass {
    public static void main(String[] args) {


    }

    static class Lens {
        //These are properties:
        String brand;
        String focalLength;
        boolean isPrime;

        //let's create constructor
        Lens(String brand, String focalLength, boolean isPrime) {

            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;


        }
    }
}
