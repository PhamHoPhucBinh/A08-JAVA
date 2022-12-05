package _06_Inheritence.pratices.shape_circle_rectangle;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double lenght = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width,double lenght) {
        this.lenght = lenght;
        this.width = width;
    }
    public Rectangle (double width,double lenght,String color,boolean filled){
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return this.lenght*this.width;
    }
    public double getParameter(){
        return (this.lenght+this.width)*2;
    }
    public String toString(){
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLenght()
                + ", which is a subclass of "
                + super.toString();
    }
}
