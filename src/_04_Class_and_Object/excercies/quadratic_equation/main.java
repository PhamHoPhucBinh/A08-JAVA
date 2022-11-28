package _04_Class_and_Object.excercies.quadratic_equation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("input a");
        a = scanner.nextDouble();
        System.out.println("input b");
        b = scanner.nextDouble();
        System.out.println("input c");
        c = scanner.nextDouble();
        quadratic_equation f = new quadratic_equation(a,b,c);
        if (f.getDiscriminant()>0){
            System.out.println("The equation has two solutions");
            System.out.println("nghiem 1 : " +f.getRoot1(f.getDiscriminant()));
            System.out.println("nghiem 2 : " +f.getRoot2(f.getDiscriminant()));
        } else if (f.getDiscriminant()==0) {
            System.out.println("equation has double solution");
            System.out.println("double solutions is: "+ f.getRoot1(f.getDiscriminant()));
        }else{
            System.out.println("no solution");
        }
    }
}
