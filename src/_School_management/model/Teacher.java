package _School_management.model;
import _School_management.utilities.constant;

public class Teacher extends Human{
    String certification;
    double salary;

    public Teacher(String certification, double salary) {
        this.certification = certification;
        this.salary = salary;
    }

    public Teacher(String id, String name, String birthday, int identityNumber, String certification, double salary) {
        super(id, name, birthday, identityNumber);
        this.certification = certification;
        this.salary = salary;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString() {
        return String.format("%s,%s,%s",super.toString(),certification,salary) ;
    }

}
