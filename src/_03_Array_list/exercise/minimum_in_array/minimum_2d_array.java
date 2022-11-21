package _03_Array_list.exercise.minimum_in_array;

import java.util.ArrayList;
import java.util.Arrays;

public class minimum_2d_array {
    public static void main(String[] args) {


        ArrayList<Integer[]> table = create2DArray();
        table.forEach(e -> {
            System.out.println(Arrays.toString(e));
        });

//        int min = Integer.MAX_VALUE;
        int min = table.get(0)[0];
        for (int i = 0; i < table.size(); i++) {
            for (int j = 0; j < table.get(i).length; j++) {
                int t = table.get(i)[j];
                if(t < min){
                    min = t;
                }
            }
        }

        System.out.println("Min: " + min);
    }

    public static ArrayList<Integer[]> create2DArray(){
        ArrayList<Integer[]> table = new ArrayList<>();
        Integer[] a = {1,3,5};
        Integer[] b = {10,30,50};
        table.add(a);
        table.add(b);
        return table;
    }
}
