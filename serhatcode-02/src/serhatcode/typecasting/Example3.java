package serhatcode.typecasting;

public class Example3 {public static void main(String[] args) {
    int intVal=10;
    float floatVal=10.0f;
    char charVal='A';

    long longVal2 = intVal;
    double doubleVal = floatVal;
    int intVal2= charVal;
    //char charval2= intVal;
    System.out.println("int to long : "+
            longVal2);
    System.out.println("float to double :"
            + doubleVal);
    System.out.println("char to int :"+
            intVal2);

}

}
