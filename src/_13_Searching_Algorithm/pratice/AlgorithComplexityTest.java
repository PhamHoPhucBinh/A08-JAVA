package _13_Searching_Algorithm.pratice;

import java.util.Scanner;

public class AlgorithComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a string : ");
        String inputString = scanner.next();


        int[] frequentChar = new int[255];
        System.out.println("1");
        for (int i = 0; i < inputString.length(); i++) {
            System.out.println("2");
        int ascii = (int) inputString.charAt(i);
            System.out.println("3");
        frequentChar[ascii] +=1;
            System.out.println("4");
        }

        int max = 0;
        System.out.println("5");
        char character = (char) 255;
        System.out.println("6");
        for (int j = 0;j<255;j++){
            System.out.println("7");
            if (frequentChar[j]>max){
                System.out.println("8");
                max = frequentChar[j];
                System.out.println("9");
                character = (char) j;
                System.out.println("10");
            }
        }
        System.out.println(character +": "+ max + " time");
    }
}
