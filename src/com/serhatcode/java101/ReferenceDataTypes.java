package com.serhatcode.java101;

import java.time.LocalDate;

public class ReferenceDataTypes {
    public static void main(String[] args) {
        //Non primitive data types

        String name = new String("serhatcode");
        System.out.println(name.toUpperCase());
        LocalDate now =  LocalDate.now();
        System.out.println(now);
        System.out.println(now.getMonth());

    }
}