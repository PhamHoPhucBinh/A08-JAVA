package Test;

public class question2 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 4, 1, 2, 5};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
