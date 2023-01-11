package _Resort_Management.model;

public abstract class Villa {
    String id;
    Double area;
    Double price;
    int maxPeople;
    String Contract;

    public Villa() {
    };

    public Villa(String id, Double area, Double price, int maxPeople, String contract) {
        this.id = id;
        this.area = area;
        this.price = price;
        this.maxPeople = maxPeople;
        Contract = contract;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getContract() {
        return Contract;
    }

    public void setContract(String contract) {
        Contract = contract;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "id='" + id + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxPeople=" + maxPeople +
                ", Contract='" + Contract + '\'' +
                '}';
    }
}
