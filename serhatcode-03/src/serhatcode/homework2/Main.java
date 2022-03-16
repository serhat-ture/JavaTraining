package serhatcode.homework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        degerAl();

    }

    public static void degerAl() {
        int[] degerler = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");

        int sum = 0;
        for (int i = 0; i < degerler.length; i++) {

            degerler[i] = scanner.nextInt();
            sum += degerler[i];
        }
        System.out.println("Average :" + sum / degerler.length);
    }


}
