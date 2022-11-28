package _04_AccessModifier_StaticMethod.excercies.fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private boolean On = false;
    private double radius = 5;
    private String color = "blue";
    private int Speed = 5;

//    public void Fan(int Speed, double radius, String color, boolean on) {
//        this.Speed = Speed;
//        this.radius = radius;
//        this.On = On;
//        this.color = color;
//    }


    public Fan(boolean on, double radius, String color, int speed) {
        On = on;
        this.radius = radius;
        this.color = color;
        Speed = speed;
    }

    public Fan() {
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public boolean isOn() {
        return On;
    }

    public void setOn(boolean on) {
        On = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    @Override
    public String toString() {
        return "fan{" +
                "SLOW=" + SLOW +
                ", MEDIUM=" + MEDIUM +
                ", FAST=" + FAST +
                ", On=" + On +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", Speed=" + Speed +
                '}';
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setColor("blue");
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
