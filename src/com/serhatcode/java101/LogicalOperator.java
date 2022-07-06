package com.serhatcode.java101;

public class LogicalOperator {
    public static void main(String[] args) {

        boolean isAdult = false;
        boolean isStudent = true;

          // (&&) Returns true if both statements are true
        System.out.println(isAdult && isStudent);

        //   (||)Returns true if one of the statements is true
        System.out.println(isAdult || isStudent);

        // (!) Reverse the result, returns false if the result is true
        System.out.println(isAdult || !isStudent);
        System.out.println(!isAdult);

        String name="Mark";
        System.out.println((10>5 || 2<=2) && isAdult && name.contains("M"));

    }
}
