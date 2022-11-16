package _02_Loping.practice.is_Prime;

import java.util.Scanner;

public class is_Prime {
    //    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("insert a number");
//        int number = scanner.nextInt();
//        if (number < 2) {
//            System.out.println(number + " is not a Prime");
//
//        } else {
//            int i = 2;
//            boolean check = true;
//            while (i <= Math.sqrt(number)) {
//                if (number % i == 0) {
//                    check = false;
//                    break;
//                }
//                i++;
//            }
//            if (check)
//                System.out.println(number + " is a Prime");
//            else
//                System.out.println(number + " is NOT a Prime");
//
////        }
//    }
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        if (isPrime(11))
            System.out.println("True");
        else
            System.out.println("False");
    }
}

