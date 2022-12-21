package _14_Sorting_Algorithm.pratice;

public class BubbleSort {
    static int[] list = {9, 5, -1, 5, 8, 134, -12, 77};

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 0; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}
//Trường hợp tốt: O(n)
//Trung bình: O(n^2)
// Trường hợp xấu: O(n^2
