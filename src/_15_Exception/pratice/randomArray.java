package _15_Exception.pratice;


import java.util.Random;

public class randomArray {
    public Integer[] randomArray() {
        Random rd = new Random();
        Integer[] array = new Integer[10];
        System.out.println("num in arr: ");
        for (int i = 0; i < 100; i++) {
            array[i] = rd.nextInt(10);
            System.out.println(array[i]+ " ");
        }
        return array;
    }
}