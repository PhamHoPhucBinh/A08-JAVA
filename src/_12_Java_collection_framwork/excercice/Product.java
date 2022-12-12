package _12_Java_collection_framwork.excercice;

import java.util.Comparator;

public class Product {
    String productID;
    String productname;
    int amount;
    String brand;

    public Product(String productID, String productname, int amount, String brand) {
        this.productID = productID;
        this.productname = productname;
        this.amount = amount;
        this.brand = brand;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        brand = brand;
    }

    public String toString() {
        return "\nProduct Details :" + "\nID: " + this.productID + "\nName: " + this.productname + "\nBrand: " +
                this.brand + "\nAmount of Product: " + this.amount;
    }
}