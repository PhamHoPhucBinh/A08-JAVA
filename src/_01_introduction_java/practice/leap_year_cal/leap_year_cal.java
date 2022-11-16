package _01_introduction_java.practice.leap_year_cal;

import java.util.Scanner;

public class leap_year_cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the year you wanna check");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%s is a leap year", year);
                } else {
                    System.out.printf("%s is NOT a leap year", year);
                    System.out.print(year + " is NOT a leap year");
                }
            } else {
                System.out.printf("%d is a leap year", year);
            }
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}

