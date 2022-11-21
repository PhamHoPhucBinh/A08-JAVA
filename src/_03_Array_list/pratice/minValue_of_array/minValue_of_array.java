package _03_Array_list.pratice.minValue_of_array;

public class minValue_of_array {
    public static void main(String[] args) {
        int[] arr = {99,6,0,-1,-99};
        int index = minValue(arr);
        System.out.println(arr[index]);
    }

    public static int minValue(int[]array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]){
                    index = i;
            }
        }
        return index;
    }
}
