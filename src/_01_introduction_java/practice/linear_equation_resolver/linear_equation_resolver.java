package _01_introduction_java.practice.linear_equation_resolver;

import java.util.Scanner;

public class linear_equation_resolver {
    public static void main(String[] args) {
        System.out.println("given an equation á 'a*x+b=0' please enter a,b");

        Scanner scanner = new Scanner(System.in);
        System.out.println("input a");
        double a = scanner.nextDouble();

        System.out.println("input b");
        double b = scanner.nextDouble();

        System.out.println("input c");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("no solution");
            }
        }
    }
}
