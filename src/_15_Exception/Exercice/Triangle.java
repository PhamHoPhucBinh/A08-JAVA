package _15_Exception.Exercice;

import java.util.Scanner;

public class Triangle {
private int a;
private int b;
private int c;

public Triangle(){};

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void check() throws IllegalTriangleException{
        if (a > 0 && b > 0 && c > 0) {
            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                System.out.println("Là ba cạnh của tam giác.");
            }
        } else {
            throw new IllegalTriangleException();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
    }
}
