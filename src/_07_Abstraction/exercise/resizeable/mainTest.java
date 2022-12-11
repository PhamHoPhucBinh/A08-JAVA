package _07_Abstraction.exercise.resizeable;

public class mainTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(2,"red",false);
        shapes[1] = new Rectangle(4,8,"blue",true);

        shapes[0].resize(100);
        shapes[1].resize(100);

        Shape.printShape(shapes);

    }
}
