package _014_Sorting_Algorithm.pratice;

import java.util.Scanner;

import static _014_Sorting_Algorithm.pratice.BubbleSort.bubbleSort;
import static _014_Sorting_Algorithm.pratice.InsertionSort.insertionSort;

public class SortTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] listTest = new int[5];
        for (int i = 0; i < 6; i++) {
            listTest[i] = scanner.nextInt();
        }
        System.out.println("sau khi bubble sort");
        bubbleSort(listTest);
        System.out.println(listTest);
        System.out.println("sau khi insertion sort");
        insertionSort(listTest);
        System.out.println(listTest);
    }

}
