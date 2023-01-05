package _Shop_Management.model;

import _Shop_Management.service.IDGenerater;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Product {
    private String productID;
    private String productName;
    private Double price;
    private String manufacturer;

    public Product() {
    }

    ;

    public Product(String productID, String productName, Double price, String manufacturer) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String toString() {
        return "\nProduct Info" +
                "\nProduct ID : " + productID +
                "\nProduct Name : " + productName +
                "\nPrice : " + price +
                "\nManufacturer : " + manufacturer;


    }
    public String getInfoToCSV(){
        return this.productID+","+this.productName  +","+this.price+","+this.manufacturer;
    }
}


