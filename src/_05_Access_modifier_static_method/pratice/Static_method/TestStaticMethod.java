package _05_Access_modifier_static_method.pratice.Static_method;

public class TestStaticMethod{
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(1,"a");
        Student s2 = new Student(2,"b");
        Student s3 = new Student(3,"c");

        s1.display();
        s2.display();
        s3.display();
    }
}
