package _Phone_Management.model;

public abstract class Phone {
    private String id;
    private String phoneName;
    private Brand brand;
    private int price;
    private int amount;

    public Phone(){};

    public Phone(String id, String phoneName, Brand brand, int price, int amount) {
        this.id = id;
        this.phoneName = phoneName;
        this.brand = brand;
        this.price = price;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id='" + id + '\'' +
                ", phoneName='" + phoneName + '\'' +
                ", brand=" + brand +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
