package serhatcode.typecasting;

public class Example2 {public static void main(String[] args) {
    int intVal1 = 10; //1010
    int intVal2 = 7;  //0111
    int intVal3 = 100;//0110 0100

    System.out.println("& result :" +
            (intVal1 & intVal2)); //0010
    System.out.println("| result :" +
            (intVal1 | intVal2)); //1111
    //D�n�� yap�lacak.
		/*System.out.println("~ result :" +
				(~intVal2)); **/

    System.out.println(">>" +
            (intVal2>>2));
		/*
		System.out.println(">>>" +
				(intVal2>>>2));**/

    System.out.println("XOR Result:"+
            (intVal1^intVal2)); //1101

    System.out.println(">> Result:"+
            (intVal3>>>5));//0000 0011
}

}
