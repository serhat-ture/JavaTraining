package serhatcode.typecasting;

public class Example5{

    public static void main(String[] args) {
        String stringVal="17";
        String stringVal2="10.5";
        String stringVal3="3147483648";

        int intVal =
                Integer.parseInt(stringVal);

        double doubleVal =
                Double.parseDouble(stringVal2);

        long longVal =
                Long.parseLong(stringVal3);

        System.out.println("string to int:"
                +intVal);
        System.out.println("string to double:"
                +doubleVal);
        System.out.println("string to long:"
                + longVal);
		/*
		 * Yanl�� string verme �rne�i
		int intVal2 =
				Integer.parseInt(stringVal2);

		System.out.println("float string to int:"
				+intVal2);
				**/

    }

}
