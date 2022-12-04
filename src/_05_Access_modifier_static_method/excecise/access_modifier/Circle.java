package _05_Access_modifier_static_method.excecise.access_modifier;

import _01_introduction_java.practice.rectangular_area.Area;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {
    }



    Circle(double r) {
        this.radius = r;
    }

    private double getRadius() {
        return radius;
    }

    protected double getArea() {
        double radius = getRadius();
        return Math.PI * Math.pow(radius, 2);

    }}
//
//    public void Calculate()
//    {
//        System.out.println(getArea() + "  &  " + getRadius());
//    }
//
//}
//
//
//public class CircleK extends Circle
//{
//
//
//    public double getArea() {
//
//    }
//
//    public void someFunc()
//    {
//        super.getArea();
//    }
//}