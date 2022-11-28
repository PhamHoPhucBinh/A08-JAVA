package _05_Access_modifier_static_method.pratice.Static_Properties;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCars;

    public Car(String name,String engine){
        this.name =name;
        this.engine = engine;
        numberOfCars++;
    }
}
