package _06_Inheritence.pratices.shape_circle_rectangle;

public class Square extends Rectangle {
    public Square(){
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLenght(side);
    }
    @Override
    public void setWidth(double width){
        setSide(width);
    }
    public void setLenght(double lenght){
        setSide(lenght);
    }
    public String toString(){
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
