package _03_Array_list.exercise.merge_array;
import java.util.ArrayList;
public class merge {


    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        array1.add(5);
        array1.add(3);
        array2.add(1);
        array2.add(2);

        array1.addAll(array2);
        System.out.println(array1);
    }
}
