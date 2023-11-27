package Test;

public class question6 {
    public static void main(String[] args) {
        int[] arr = {8,2,5,2,43,1};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                    temp = arr[j];
                    arr[j]=arr[i];
                    arr[i] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
