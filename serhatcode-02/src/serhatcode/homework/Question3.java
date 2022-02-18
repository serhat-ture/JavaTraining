package serhatcode.homework;

import java.util.Scanner;

// Kullanıcıdan bir int tipinde tam sayı alınız.
// Aldığınız sayıya göre oluşturulacak üçgen aşağıdaki gibi olmalıdır. (Sola dayalı ters dik üçgen)
public class Question3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number :");
        int i = scanner.nextInt();


        while (i > 0) {

            i--;
            int j = 0;

            while (j <= i) {

                System.out.print("*");
                j++;

            }
            System.out.println();
        }

    }
}
