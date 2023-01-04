package _Vehicle_management.model;

//import util.ConstantUtil;

public class Car extends Vehicle {
    private int numOfSeat;
    private _Vehicle_management.Util.ConstantUtil.TypeOfCar typeOfCar;

    public Car(int numOfSeat, _Vehicle_management.Util.ConstantUtil.TypeOfCar typeOfCar) {
        this.numOfSeat = numOfSeat;
        this.typeOfCar = typeOfCar;
    }

    public Car(String vehicleID, Manufacturer manufacturer, int year, String owner, int numOfSeat, _Vehicle_management.Util.ConstantUtil.TypeOfCar typeOfCar) {
        super(vehicleID, manufacturer, year, owner);
        this.numOfSeat = numOfSeat;
        this.typeOfCar = typeOfCar;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    public _Vehicle_management.Util.ConstantUtil.TypeOfCar getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(_Vehicle_management.Util.ConstantUtil.TypeOfCar typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public String toString(){
        return "Car{" +
                "numberOfSeat=" + numOfSeat +
                ", typeOfCar=" + typeOfCar +
                "} " + super.toString();
    }
}
