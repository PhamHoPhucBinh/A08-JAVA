package _01_introduction_java.excercise.hello;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert your name");
        String name = scanner.nextLine();
        System.out.println("hello  " + name );

    }
}
