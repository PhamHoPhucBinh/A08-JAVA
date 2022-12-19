package _13_Searching_Algorithm.exercice.TimChuoiTangDan;

import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiTangDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a string : ");
        String inputString = scanner.next();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < inputString.length();i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(inputString.charAt(i));
            for (int j = i+1;j<inputString.length();j++){
                if (inputString.charAt(j)>list.getLast()){
                    list.add(inputString.charAt(j));
                }
            }
        }
    }
}
