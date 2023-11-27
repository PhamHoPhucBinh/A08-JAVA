package Test;

public class question4 {
    public static boolean isPrime(int input) {
        if (input <= 1) {
            return false;
        }
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
         int num = 97;
        System.out.println( isPrime(num));
    }
}
