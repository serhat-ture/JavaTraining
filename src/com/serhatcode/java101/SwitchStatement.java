package com.serhatcode.java101;

public class SwitchStatement {
    public static void main(String[] args) {
        String gender = "MALE";

        switch (gender){
            case "FEMALE":
                System.out.println("I am a female");
                break;
            case "MALE":
                System.out.println("I am a male");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("prefer not say");
                break;
            default:
                System.out.println("unknown gender");
        }

    }
}