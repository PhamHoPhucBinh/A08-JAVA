package _03_Array_list.pratice.check_score;

import java.util.Scanner;

public class check_score {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner score = new Scanner(System.in);
        do {
            System.out.println("Enter a size : ");
            size = score.nextInt();
            if (size < 30)
                System.out.println("size is over 30");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter a mark for student : " + (i + 1) + ":");
            array[i] = score.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("list of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] <= 50);
            count++;
        }
        System.out.println("\n The number of student passed is " + count);
    }
}