package _06_Inheritence.excercies.Cylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "blue";
    private boolean filled = true;
    Circle(){
    }
    Circle(double radius,String color,boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = true;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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
    public String toString() {
        return "a circle with color of " + getColor() + " and " + ((isFilled()) ? " filled " : "not filled");
    }
}
