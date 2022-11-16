package _02_Loping.exercice.drawing_chart;

import java.util.Scanner;

public class drawing_chart {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw triagle square at bottom-left");
            System.out.println("3. Draw triagle square at top-left");
            System.out.println("4. Draw isosceles triangle.");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int width;
                    int longs;
                    System.out.println("insert rec's width: ");
                    width = scanner.nextInt();
                    System.out.println("insert rec's longs: ");
                    longs = scanner.nextInt();
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < longs; j++) {
                            System.out.println("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("insert triangle's height : ");
                    int height ;
                    height = scanner.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("insert triangle's height : ");
                    int height2 ;
                    height2 = scanner.nextInt();
                    for (int i = height2;i>=1; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("insert triangle's height : ");
                    int height3 ;
                    height3 = scanner.nextInt();
                    for (int i = 1; i <= height3; i++) {
                        for (int j = height3; j > i; j--) {
                            System.out.print("   ");
                        }
                        for (int k = 1; k <= i * 2 - 1; k++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }

        }
    }
}
