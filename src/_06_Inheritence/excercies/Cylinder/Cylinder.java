package _06_Inheritence.excercies.Cylinder;

public class Cylinder extends Circle {
    private double height = 1.0;
    public Cylinder(){};
    public Cylinder(double height){
        this.height = height;
    }

    Cylinder(double radius, String color, boolean filled,double height) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return 2*Math.PI*Math.pow(this.getRadius(),2)
                +2*Math.PI*this.getRadius()*height;
    }
    public double getVolume(){
        return Math.pow(this.getRadius(),2)*height;
    }

}
