package _19_ReGex.excecise;

public class PhoneNumberValidate {
    public static void main(String[] args) {
        String num1 = "0923695395";
        String phoneRegex = "(^84|0[3|5|7|8|9])+([0-9]{8,9}$)\\b";
        System.out.println(num1.matches(phoneRegex));;

    }
}
