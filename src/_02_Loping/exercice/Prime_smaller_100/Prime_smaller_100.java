package _02_Loping.exercice.Prime_smaller_100;

public class Prime_smaller_100 {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                if (i < 100) {
                    System.out.println(i);
                }

            }
        }
    }

}
