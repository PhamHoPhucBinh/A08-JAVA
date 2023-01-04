package _Vehicle_management.model;

public class Manufacturer {
    private String code;
    private String name;
    private String country;

    public Manufacturer(){};

    public Manufacturer(String code, String name, String country) {
        this.code = code;
        this.name = name;
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString() {
        return "{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
