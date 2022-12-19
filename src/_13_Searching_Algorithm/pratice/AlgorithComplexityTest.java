package _13_Searching_Algorithm.pratice;

import java.util.Scanner;

public class AlgorithComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a string : ");
        String inputString = scanner.next();


        int[] frequentChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
        int ascii = (int) inputString.charAt(i);
        frequentChar[ascii] +=1;
        }

        int max = 0;
        char character = (char) 255;
        for (int j = 0;j<255;j++){
            if (frequentChar[j]>max){
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println(character +": "+ max + " time");
    }
}
