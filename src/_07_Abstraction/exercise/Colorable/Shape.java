package _07_Abstraction.exercise.Colorable;

public abstract class Shape implements iColorable {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public static void printShape(Shape[] shapes) {
        for (Shape x : shapes) {
            System.out.println(x.toString());
        }
    }

    public static boolean isColorable(Shape shapes) {
        return shapes != null;
    }
}