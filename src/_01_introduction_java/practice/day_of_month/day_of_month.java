package _01_introduction_java.practice.day_of_month;

import java.util.Scanner;

public class day_of_month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("choose a month");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("this month has 28 or 29 days");
                break;
            case 1:
                System.out.print("this month " + month + "has 31 days");
                break;
            case 3:
                System.out.print("this month " + month + "has 31 days");
                break;
            case 5:
                System.out.print("this month " + month + "has 31 days");
                break;
            case 7:
                System.out.print("this month " + month + "has 31 days");
                break;
            case 8:
                System.out.print("this month " + month + "has 31 days");
                break;
            case 10:
                System.out.print("this month " + month + "has 31 days");
                break;
            case 12:
                System.out.print("this month " + month + "has 31 days");
                break;
            case 4:
                System.out.print("this montj" + month + "has 30 days");
                break;
            case 6:
                System.out.print("this montj" + month + "has 30 days");
                break;
            case 9:
                System.out.print("this montj" + month + "has 30 days");
                break;
            case 11:
                System.out.print("this montj" + month + "has 30 days");
                break;
        }
    }

}
