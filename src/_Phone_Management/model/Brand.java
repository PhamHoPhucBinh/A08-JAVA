package _Phone_Management.model;

public class Brand {
    private String brandName;
    private String country;
    private int year;

    public Brand(String brandName, String country, int year) {
        this.brandName = brandName;
        this.country = country;
        this.year = year;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandName='" + brandName + '\'' +
                ", country='" + country + '\'' +
                ", year=" + year +
                '}';
    }
}
