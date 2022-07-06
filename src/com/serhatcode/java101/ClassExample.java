package com.serhatcode.java101;

import java.time.LocalDate;

public class ClassExample {
    public static void main(String[] args) {

        Passport ukPassport = new Passport("24123", "UK", LocalDate.of(2025, 1, 2));

        Passport usPassport = new Passport("24123", "USA", LocalDate.of(2030, 5, 23));

        System.out.println(usPassport.number);
        System.out.println(usPassport.country);
        System.out.println(usPassport.expiryDate);
    }

    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;


        Passport(String number, String country, LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }

    }
}
