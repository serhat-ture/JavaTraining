package com.serhatcode.java101;

public class CreatingObject {public static void main(String[] args) {
    //Objects
    Lens lensOne = new Lens("sony", "85mm",true);
    Lens lensTwo = new Lens("sony", "30mm",true);
    Lens lensThree = new Lens("canon", "24-70mm",false);

    System.out.println("Lens 1");
    System.out.println(lensOne.brand);
    System.out.println(lensOne.focalLength);
    System.out.println(lensOne.isPrime);
    System.out.println();

    System.out.println("Lens 2");
    System.out.println(lensTwo.brand);
    System.out.println(lensTwo.focalLength);
    System.out.println(lensTwo.isPrime);
    System.out.println();

    System.out.println("Lens 3");
    System.out.println(lensThree.brand);
    System.out.println(lensThree.focalLength);
    System.out.println(lensThree.isPrime);


}
    // this is template!!!
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