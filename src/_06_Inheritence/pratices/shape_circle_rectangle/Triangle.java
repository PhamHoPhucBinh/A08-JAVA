package _06_Inheritence.pratices.shape_circle_rectangle;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(){};
    public Triangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getParameter(){
        return this.side1+this.side2+this.side3;
    }
    public double getArea(){
        double p = this.getParameter()/2;
        double t = (p- side1)*(p- side2)*(p- side3);
        double t2 = p*t;
        double t3 = Math.sqrt(t2);
        double t4 =Math.sqrt(p*(p-this.getSide1())*(p-this.getSide2())*
                (p-this.getSide3()));
        return t3;
    }
}
