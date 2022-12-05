package _06_Inheritence.excercies.Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5,"red",false,10);
        System.out.println(cylinder.getArea());
        System.out.println("volume = " + cylinder.getVolume());
    }
}
