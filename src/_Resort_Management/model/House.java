package _Resort_Management.model;

public class House extends Villa {
    String standard;
    int numOfFloor;

    public House(String standard, int numOfFloor) {
        this.standard = standard;
        this.numOfFloor = numOfFloor;
    }

    public House(String id, Double area, Double price, int maxPeople, String contract, String standard, int numOfFloor) {
        super(id, area, price, maxPeople, contract);
        this.standard = standard;
        this.numOfFloor = numOfFloor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(int numOfFloor) {
        this.numOfFloor = numOfFloor;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s",super.toString(),standard,numOfFloor);
    }
}
