package _04_AccessModifier_StaticMethod.excercies.quadratic_equation;

import java.util.Scanner;

public class quadratic_equation {
    private double a, b, c;

    public quadratic_equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        if (a != 0) {
            return ((Math.pow(b, 2)) - 4 * a * c);
        } else {
            return -1;
        }
    }

    public double getRoot1(double delta) {
        if (delta < 0) {
            return 0;
        } else {
            return (-1 * b + Math.sqrt(delta)) / 2 * a;
        }
    }

    public double getRoot2(double delta) {
        if (delta < 0) {
            return 0;
        } else {
            return (-1 * b + Math.sqrt(delta)) / 2 * a;
        }
    }
}
