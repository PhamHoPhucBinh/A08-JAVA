package _Vehicle_management.model;

public class Moto extends Vehicle {
    private Double wattage;

    public Moto(Double wattage) {
        this.wattage = wattage;
    }

    public Moto(String vehicleID, Manufacturer manufacturer, int year, String owner, Double wattage) {
        super(vehicleID, manufacturer, year, owner);
        this.wattage = wattage;
    }

    public Double getWattage() {
        return wattage;
    }

    public void setWattage(Double wattage) {
        this.wattage = wattage;
    }
    public String toString() {
        return "Motor{" +
                "wattage=" + wattage +
                "} " + super.toString();
    }
}
