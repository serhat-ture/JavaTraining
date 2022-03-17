package serhatcode.homework3;

public class Calculator {
    public static int numberOne = 8;
    public static int numberTwo = 2;

    public static int sum() {
        return numberOne + numberTwo;
    }

    public static int diff() {
        return numberOne - numberTwo;
    }

    public static int multiplication() {
        return numberOne * numberTwo;
    }

    public static int divide() {
        return numberOne / numberTwo;
    }


    public static void main(String[] args) {
        System.out.println("sum :"+sum());
        System.out.println("diff :"+diff());
        System.out.println("multiplication :"+multiplication());
        System.out.println("divide :"+divide());



    }
}
