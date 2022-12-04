package _05_Access_modifier_static_method.excecise.access_modifier2;

public class mainStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName() + " & " + student.getClasses());
        //change details
        student.setName("Binh")  ;
        student.setClasses("A32");
        System.out.println(student.getName() + " & " + student.getClasses());
    }
}
