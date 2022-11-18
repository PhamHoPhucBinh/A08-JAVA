package _03_Array_list.exercise.minimum_in_array;

import java.util.ArrayList;

public class minimum {

        public static void main(String[] args) {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();

            for (int i = 0; i < 10; i++) {
                arrayList.add((int) Math.floor(Math.random() * 100));
            }

            System.out.println(arrayList);

            int minNuminArray = arrayList.get(0);
            for (int i = 0; i < arrayList.size(); i++) {
                if (minNuminArray > arrayList.get(i)) {
                    minNuminArray = arrayList.get(i);
                }
            }
            System.out.println(minNuminArray);
        }
    }


