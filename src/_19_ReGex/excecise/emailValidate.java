package _19_ReGex.excecise;

public class emailValidate {
    public static void main(String[] args) {
        String emailRegex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        String simpleEmailRegex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        String mail1 = "hophucbinh_2396@gmail.com";
        System.out.println(mail1.matches(emailRegex));
        System.out.println(mail1.matches(simpleEmailRegex));
    }
}
