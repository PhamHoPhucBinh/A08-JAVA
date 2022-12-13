package _my_CaseStudy.person;

public class Employee extends Person {
    int employeeCode;
    String degree;
    String position;
    float salary;

    public Employee(int employeeCode, String degree, String position, float salary) {
        super();
        this.employeeCode = employeeCode;
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int employeeCode, String name, String dayOfBirth, String gender, long contact, String email, String degree,String position, float salary) {

    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString() {
        return super.toString()
                + "\nEmployee Code: " + this.employeeCode + "\nDegree" + this.degree + "\nPosition : "
                + this.position + "\nSalary : " + this.salary;
    }
}
