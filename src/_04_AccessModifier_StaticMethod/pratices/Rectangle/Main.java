package _04_AccessModifier_StaticMethod.pratices.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width");
        double width = scanner.nextDouble();
        System.out.println("Enter the height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("your rectangle \n"+rectangle.display());
        System.out.println("Perimeter of Rec: "+rectangle.getPerimeter());
        System.out.println("Area of Rec: " + rectangle.getArea());
    }
}


