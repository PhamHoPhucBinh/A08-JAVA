package _03_Array_list.exercise.maximum_in_array;

import java.util.ArrayList;

public class maximum {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            arrayList.add((int) Math.floor(Math.random() * 100));
        }

        System.out.println(arrayList);

        int maxNuminArray = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (maxNuminArray < arrayList.get(i)) {
                maxNuminArray = arrayList.get(i);
            }
        }
        System.out.println(maxNuminArray);
    }
}
