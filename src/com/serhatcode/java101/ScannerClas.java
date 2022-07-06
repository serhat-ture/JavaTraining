package com.serhatcode.java101;

import java.time.LocalDate;
import java.util.Scanner;

public class ScannerClas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);

        System.out.println(" How old are you? ");
        int age = scanner.nextInt();

        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You ere born in " + year);

        if (age < 18) {
            System.out.println("and you are not adult.");
        } else {
            System.out.println("and you are adult.");
        }

    }
}
