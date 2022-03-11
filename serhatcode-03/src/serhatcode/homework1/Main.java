package serhatcode.homework1;

// Main hariç 4 method yazınız. Bu methodlar birbirini çağırmalı.
// Main->method1 i çağırmalı , method1->method2 yi çağırmalı, method2->method3 ‘ü çağırmalı, method3->method4 ü çağırmalı.
// Method 4 den bir exception fırlatıp mainde yakalamasi gerekiyor. Exception türü farketmez.
// Bu örnekte try catch throws ve throw keywordlerini kullanmanız gerekiyor.


import java.io.IOException;

public class Main {

    public static void method1() {
        method2();
        System.out.println("Method1");
    }

    public static void method2() {

        method3();
        System.out.println("Method2");
    }

    public static void method3() {

        try {
            method4();
        } catch (IOException e) {
            System.out.println("Exception block");
            e.printStackTrace();
        }
        System.out.println("Method3");

    }

    public static void method4() throws IOException {

        throw new IOException();

    }

    public static void main(String[] args) {

        method1();


    }


}
