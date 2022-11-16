package _02_Loping.practice.interest_cal;

import java.util.Scanner;

public class interest_cal {
    public static void main(String[] args) {
        double money = 1;
        int month = 1;
        double interestRate = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert investment amount : ");
        money = scanner.nextDouble();
        System.out.println("insert interest Rate : ");
        interestRate = scanner.nextDouble();
        System.out.println("how long do you want to invest ?");
        month = scanner.nextInt();

        double totalInterest = 0;
        for (int i = 0;i<month;i++){
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("your total is " + totalInterest);
    }
}
