package _Vehicle_management.model;

public class Truck extends Vehicle{
    private Double load;

    public Truck(Double load) {
        this.load = load;
    }

    public Truck(String vehicleID, Manufacturer manufacturer, int year, String owner, Double load) {
        super(vehicleID, manufacturer, year, owner);
        this.load = load;
    }

    public Double getLoad() {
        return load;
    }

    public void setLoad(Double load) {
        this.load = load;
    }
    @Override
    public String toString() {
        return "Truck{" +
                "load=" + load +
                "} " + super.toString();
    }
}
