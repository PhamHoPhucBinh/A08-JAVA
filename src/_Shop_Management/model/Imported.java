package _Shop_Management.model;

import _Shop_Management.util.ConstantUtil;

public class Imported extends Product {
    private String country;
    private ConstantUtil.ProductStatus productStatus;

    public Imported(String country, ConstantUtil.ProductStatus productStatus) {
        this.country = country;
        this.productStatus = productStatus;
    }

    public Imported(String productID, String productName, Double price, String manufacturer, String country, ConstantUtil.ProductStatus productStatus) {
        super(productID, productName, price, manufacturer);
        this.country = country;
        this.productStatus = productStatus;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ConstantUtil.ProductStatus getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(ConstantUtil.ProductStatus productStatus) {
        this.productStatus = productStatus;
    }

    public String toString() {
        return "Country : " + country +
                "\nproductStatus : " + productStatus + super.toString();
    }
}
