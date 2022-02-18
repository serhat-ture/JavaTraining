package serhatcode.homework;
// Aşağıdaki switch kodunu if li yapıya çevirerek tekrar yazınız.
//        switch(m){
//        case 0:
//        x=x+2;
//        System.out.println(“X=” x);
//        break;
//        case 1:
//        x=x+4;
//        System.out.println(“X=” x);
//        break;
//        case 2:
//        x=x+6;
//        System.out.println(“X=” x);
//        break;
//        }
//
//        Yukarıda ;
//        m kullanıcıdan alınan bir int değer.
//        x ise x=6 gibi oluşturulacak bir değişken.

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number :");
        int m= scanner.nextInt();
        int x=6;

        if(m==0){
            x= x+2;
            System.out.println("X=" +x);
        }
        else if(m==1){
            x= x+4;
            System.out.println("X=" +x);
        }
        if(m==2){
            x= x+6;
            System.out.println("X=" +x);
        }

    }


}
