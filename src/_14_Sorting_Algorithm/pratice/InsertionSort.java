package _14_Sorting_Algorithm.pratice;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }
}

//Trường hợp tốt: O(n)
//Trung bình: O(n^2)
// Trường hợp xấu: O(n^2)

