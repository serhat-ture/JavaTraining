package examples.q2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {


        ArrayList<Employee> employee= new ArrayList<>();

        employee.add(new Employee("dd","tu",9000));
        employee.add(new Employee("aa","at",5000));
        employee.add(new Employee("bb","bt",4000));
        employee.add(new Employee("cc","ct",6000));

        for (Employee e: employee ) {
            System.out.println(e.getName()+" "+e.getSurName()+" "+e.getSalary());

        }
        System.out.println("***after sort*********");
        Collections.sort(employee);
        for (Employee e: employee ) {
            System.out.println(e.getName()+" "+e.getSurName()+" "+e.getSalary());

        }

        System.out.println("******Reverse Sorting *****");
             Collections.sort(employee, Collections.reverseOrder());
        for (Employee e: employee ) {
            System.out.println(e.getName()+" "+e.getSurName()+" "+e.getSalary());

        }




    }






}
