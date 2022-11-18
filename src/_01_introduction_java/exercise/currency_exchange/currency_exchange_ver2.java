package _01_introduction_java.exercise.currency_exchange;

import java.util.Scanner;

public class currency_exchange_ver2 {
//    private static Scanner num = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double rate =0;
        int choice;
        double vnd = 0;
        double yuan = 0;
        String VietnamDong = "";

        System.out.println("input the rate : ");
        rate = num.nextDouble();

        System.out.println("input way to exchange : ");
        choice = num.nextInt();

        if (choice == 0) {

            System.out.println("how much do VND want to exchange? ");
            vnd = num.nextDouble();
            yuan = vnd / rate;
            System.out.println(vnd + " VND" + "is " + yuan + " Yuan");
        } else if (choice==1) {
            System.out.println("how much do Yuan want to exchange? ");
            yuan = num.nextDouble();
            vnd = yuan * rate;
            VietnamDong = vnd + " ";
            System.out.println(yuan + " Yuan" + "is " + vnd + " VND");
//            System.out.println(VietnamDong.substring(0,(VietnamDong.indexOf(".")+1) ) + " dollars");
        }
    }
}
