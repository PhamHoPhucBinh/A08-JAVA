package _04_Class_and_Object.pratices.StaticMethodPractice;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //constructor to initialize the variable
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    //mehthod to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

