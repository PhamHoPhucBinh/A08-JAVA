package vehicle_manager.VehicleManager_p2_file.src.model;

import util.ConstantUtil.TypeOfCar;
import vehicle_manager.VehicleManager_p1_collection.src.model.Manufacturer;
import vehicle_manager.VehicleManager_p1_collection.src.model.Vehicle;

public class Car extends Vehicle {
    private int numberOfSeat;

    private TypeOfCar typeOfCar;

    public Car(int numberOfSeat, TypeOfCar typeOfCar) {
        this.numberOfSeat = numberOfSeat;
        this.typeOfCar = typeOfCar;
    }

    public Car(String driverPlate, Manufacturer manufacturer, int yearOfManufacturer, String owner, int numberOfSeat, TypeOfCar typeOfCar) {
        super(driverPlate, manufacturer, yearOfManufacturer, owner);
        this.numberOfSeat = numberOfSeat;
        this.typeOfCar = typeOfCar;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public TypeOfCar getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(TypeOfCar typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s", super.toString(), numberOfSeat, typeOfCar.name());
    }
}
