package examples.q1;

/*Create a Student class. Add a student object to a list of 3 elements.
After adding the object, sort the list according to the student number.
 (Must contain student class number, name , surname)*/


public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private int number;

    public Student(String name, String surname, int number) {
        super();
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", surname=" + surname + ", number=" + number + "]";
    }

    //negatif d?nerse this<that
    //0 d?nerse this=that
    //pozitif d?nerse this>that
    @Override
    public int compareTo(Student o) {
        return o.getNumber()-this.number;
    }

}