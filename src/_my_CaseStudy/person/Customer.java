package _my_CaseStudy.person;

import java.text.DateFormat;

public class Customer extends Person{
    String customerCode;
    String customerType;
    String address;

    public Customer(String name, String dayOfBirth, String gender, int idNumber, long contact, String email) {
        super(name, dayOfBirth, gender, idNumber, contact, email);
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
