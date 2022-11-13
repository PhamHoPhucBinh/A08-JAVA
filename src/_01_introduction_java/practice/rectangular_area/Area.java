package _01_introduction_java.practice.rectangular_area;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter width: ");
        width = scanner.nextFloat();

        System.out.println("enter height");
        height = scanner.nextFloat();

        float area = width*height;
        System.out.println("area = " + area);
    }
}
