package _03_Array_list.exercise.del_element_from_array;
import java.util.ArrayList;
import java.util.Arrays;

public class del {
    public static void main(String[] args) {
        ArrayList<Integer> group = new ArrayList<Integer>(4);
        group.add(999);
        group.add(82719);
        group.add(2);
        group.add(2);
        System.out.println(group);
        //remove theo index
        group.remove(1);
        System.out.println(group);
    }
}
