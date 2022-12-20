package _11_DSA_Stack_Queue.excercice.ThapPhanSangNhiPhan;
import java.util.*;
public class ThapPhanToNhiPhanStack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Nhập vào số thập phân: ");
        int num = in.nextInt();
        while (num != 0) {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
        System.out.print("\nGiá trị nhị phân là: ");
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
    }
}
