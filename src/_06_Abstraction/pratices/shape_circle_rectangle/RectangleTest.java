package _06_Abstraction.pratices.shape_circle_rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(5,10,"blue",false);
        System.out.println(rectangle1 + "  " + rectangle1.getArea() + " & " + rectangle1.getParameter());
    }
}
