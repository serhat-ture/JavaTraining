package studentSystem;

import examples.q1.Student;

import java.util.*;

public class Main {
    public static final Scanner CONSOLE = new Scanner(System.in);


    public static void printStudentList(Map<Integer, String> studentMap) {

        studentMap.put(10, "Cemal");
        studentMap.put(5, "Jale");
        studentMap.put(1, "Polat");
        studentMap.put(2, "Pelin");
        studentMap.put(100, "Ceyda");

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {

            System.out.println(" Student No : " + entry.getKey() + ",  Student : " + entry.getValue());

        }


    }

    public static void addStudent(Map<Integer, String> studentMap) {

        System.out.print(" Enter student ID to add  the list");
        Integer idNumber = Integer.parseInt(CONSOLE.nextLine());

        System.out.print("Enter Name:");
        String name = CONSOLE.nextLine();

        studentMap.put(idNumber, name);

        System.out.println("Student Id Number:" + idNumber + ", Student Name :" + name + " has been written. ");


    }

    public static void removeStudent(Map<Integer, String> studentMap) {
        System.out.println(" Enter student ID to remove the list");

        Integer idNumber = Integer.parseInt(CONSOLE.nextLine());
        studentMap.remove(idNumber);


    }


    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();


        printStudentList(studentMap);

     //   addStudent(studentMap);
        removeStudent(studentMap);

        printStudentList(studentMap);
    }

}