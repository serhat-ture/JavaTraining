package examples.q2;

public class Employee implements  Comparable <Employee>{


    private String name;
    private String surName;
    private int salary;


    public Employee(String name, String surName, int salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                '}';
    }


    public int compareTo(Employee o) {

        if (this.salary < o.salary)  /// >   sort change
            return  -1;
        else if (this.salary==o.salary)
            return 0;
        return -1;
    }


}
