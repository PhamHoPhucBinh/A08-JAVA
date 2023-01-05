package _Shop_Management.model;

public class Domestic extends Product {
    String warrantyPeriod;

    public Domestic(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public Domestic(String productID, String productName, Double price, String manufacturer, String warrantyPeriod) {
        super(productID, productName, price, manufacturer);
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String toString() {
        return "Warranty Period : " + warrantyPeriod + super.toString();
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.warrantyPeriod;

    }
}
