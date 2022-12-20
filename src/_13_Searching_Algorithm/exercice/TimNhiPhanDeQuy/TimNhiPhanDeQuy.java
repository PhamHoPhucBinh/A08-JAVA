package _13_Searching_Algorithm.exercice.TimNhiPhanDeQuy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static _13_Searching_Algorithm.exercice.TimNhiPhanDeQuy.InsertionSort.insertionSort;

public class TimNhiPhanDeQuy {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("array gom bao nhieu so?  ");
        n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("nhap so vao array : ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        insertionSort(array);
        System.out.println("After Insertion Sort");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(binarySearch(array,0,5,5));
    }

    static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (array[middle] == value) {
            return middle;
        }
        if (middle == right) {
            return -1;
        }
        if (array[middle] > value) {
            return binarySearch(array, left, middle - 1, value);
        } else {
            return binarySearch(array, middle + 1, right, value);
        }
    }
}
