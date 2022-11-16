package _02_Loping.practice.uoc_so_chung_lon_nhat;

import java.util.Scanner;

public class uoc_so_chung_lon_nhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter a : ");
        a = Math.abs(scanner.nextInt());
        System.out.println(" enter b : ");
        b = Math.abs(scanner.nextInt());
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");

        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;

        }
        System.out.println(" Greatest common factor: " + a) ;
    }
}
