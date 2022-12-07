package _06_Inheritence.pratices.shape_circle_rectangle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);

    }


    @Override
    public int compareTo(ComparableCircle o) {
       double t = getRadius() - o.getRadius();
       return t > 0? 1: -1;
    }
}

