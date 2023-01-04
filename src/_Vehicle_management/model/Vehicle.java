package _Vehicle_management.model;

public class Vehicle {
    private String vehicleID;
    private Manufacturer manufacturer;
    private int year;
    private String owner;
    public Vehicle(){};

    public Vehicle(String vehicleID, Manufacturer manufacturer, int year, String owner) {
        vehicleID = vehicleID;
        this.manufacturer = manufacturer;
        this.year = year;
        this.owner = owner;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        vehicleID = vehicleID;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String toString(){
        return "Vehicle{" +
                "driverPlate='" + getVehicleID() + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfManufacturer=" + year +
                ", owner='" + owner + '\'' +
                '}';
    }
}
