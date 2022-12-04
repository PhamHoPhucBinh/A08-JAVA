package _06_Abstraction.pratices.shape_circle_rectangle;

public class Circle extends Shape {
    private double radius = 1.0;
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle (double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getParameter(){
        return radius*2*Math.PI;
    }
    public String toString(){
        return "A circle with radius= "
                + getRadius()
                + " , which is a subclass of "
                + super.toString();
    }
}
