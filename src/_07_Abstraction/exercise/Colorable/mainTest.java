package _07_Abstraction.exercise.Colorable;

public class mainTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[1];
        shapes[0] = new Circle("red",false,10);
        Shape.printShape(shapes);
        shapes[0].howToColor();
        System.out.println();
    }
}
