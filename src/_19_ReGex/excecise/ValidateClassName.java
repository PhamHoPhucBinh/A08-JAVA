package _19_ReGex.excecise;

public class ValidateClassName {
    public static void main(String[] args) {
        String regex = "[AC]\\d{4}[IGL]\\d$";
        String classname1 = "A0822I1";
        String classname2 = "C0511K2";
        System.out.println(classname1.matches(regex));
        System.out.println(classname2.matches(regex));
    }
}
