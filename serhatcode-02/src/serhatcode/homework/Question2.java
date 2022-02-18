package serhatcode.homework;
//20’ye kadar olan sayılarda asal olan sayıları bulan kodu yazınız. (while döngüsü kullanma koşulu vardır)
public class Question2 {

    public static void main(String[] args) {


        int sayi=0;
        while (sayi<20) {


            if (sayi%2==1 && sayi/2!=0) {
                System.out.println(sayi);
            }
            sayi++;

        }

    }
}
