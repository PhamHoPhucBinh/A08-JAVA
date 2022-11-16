package _01_introduction_java.practice.add_remove_in_array;

import java.util.ArrayList;
import java.util.Iterator;

public class array_section {
    public static void main(String[] args) {
        //int[] myNum = { 1, 3, 5};
        //add
        ArrayList<Integer> myNum = new ArrayList<Integer>();
        myNum.add(1);
        myNum.add(2);
        myNum.add(3);
        myNum.add(3);
        myNum.add(3);
        myNum.add(4);
        myNum.add(2,99);
        System.out.println("added array " + myNum);
        //del
//        myNum.remove(3);
//        myNum.remove(Integer.valueOf(3));
        Iterator itr = myNum.iterator();
        while (itr.hasNext()) {
            // Iterator.remove()
            int x = (Integer)itr.next();
            if (x == 3)
                itr.remove();
        }

        System.out.println("deleted arr " + myNum);

    }
}
