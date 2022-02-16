package serhatcode.typecasting;

public class Example6 {

    public static void main(String[] args) {
        //d�� blok
        //Soru 1
        int intVal;
        {//1.blok
            intVal=10;
            int intVal2;
        }
        {//2.blok
            int intVal2;

        }
        String stringVal="20";

        //Casting String -> int(primitive)
        intVal = Integer.parseInt(stringVal);

        System.out.println("Cast Result :"
                + intVal);

        //Soru 2
        Double doubleWrapper = 20.5;
        double doubleVal;

        doubleVal = doubleWrapper;

        System.out.println("Cast Result 2:"
                +doubleVal);

        //Soru 3
        float burak=10.7f;
        double duman;

        duman = burak;

        System.out.println("Cast Result 3: "
                + duman);

        //Soru 4
        float burak1;
        double duman1=10.7;

        burak1 = (float)duman1;

        System.out.println("Cast Result 4: "
                + burak1);
    }

}
