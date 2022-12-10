package _06_Inheritence.pratices.shape_circle_rectangle;
import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.io.*;
public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[4];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle(3,"b",false);
        circles[2] = new ComparableCircle(3, "a", true);
        circles[3] = new ComparableCircle(3, "c", true);
        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles, Comparator.comparingDouble(ComparableCircle::getRadius).thenComparing(ComparableCircle::getColor));

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
