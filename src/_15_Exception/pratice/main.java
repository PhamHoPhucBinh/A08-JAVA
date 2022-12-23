package _15_Exception.pratice;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    randomArray arrEx = new randomArray();
    Integer[] array = arrEx.randomArray();

        Scanner scanner = new Scanner(System.in);
        System.out.println("input a number");
        int x = scanner.nextInt();

        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + array[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("error");
        }
    }
}