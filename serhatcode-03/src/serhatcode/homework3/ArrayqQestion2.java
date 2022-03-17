package serhatcode.homework3;

import java.util.Arrays;

/* A?a??daki gibi movieSeats ad?nda array tan?mlay?n?z. Array bir sinema salonundaki koltuk numaralar?n? temsil etmektedir. Buradaki baz? koltuklar?n? doldurunuz ve sonra arrayi tekrardan yazd?r?n?z.
         String[][] movieSeats = new String[][] {
         { "A1", "A2", "A3", "A4", "A5", "A6" },
         { "B1", "B2", "B3", "B4", "B5", "B6" },
         { "C1", "C2", "C3", "C4", "C5", "C6" },
         { "D1", "D2", "D3", "D4", "D5", "D6" }
         };
         Örnek ç?kt?:

         movieSeats C4 deki nin de?erine = burak
         movieSeats B2 dekinin de?erine = duman dedikten sonra yazd?rma i?lemi ve ç?kt?

         { "A1", "A2", "A3", "A4", "A5", "A6" }
         { "B1", "duman", "B3", "B4", "B5", "B6" }
         { "C1", "C2", "C3", "burak", "C5", "C6" }
         { "D1", "D2", "D3", "D4", "D5", "D6" } olmal?d?r.
*/
public class ArrayqQestion2 {
    public static void main(String[] args) {

        String[][] movieSeats = new String[][] {
                { "A1", "A2", "A3", "A4", "A5", "A6" },
                { "B1", "B2", "B3", "B4", "B5", "B6" },
                { "C1", "C2", "C3", "C4", "C5", "C6" },
                { "D1", "D2", "D3", "D4", "D5", "D6" }
        };

        System.out.println("koltuk D3 bos : " + movieSeats[3][2]);
        movieSeats[3][2] = "serhat";
        movieSeats[2][1]="ahmet";
        System.out.println("koltuk D3 alindi : " + movieSeats[3][2]);
        System.out.println("koltuk C2 alindi : " + movieSeats[2][1]);


        System.out.println(Arrays.deepToString(movieSeats));

    }
    }

