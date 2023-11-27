package Test;


public class question1 {


    public static void main(String[] args) {
        int[] arr = {100, 77, 99, 120, 66};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[0]){
                max = arr[i];
            }
        } System.out.println(max);
    }

}
