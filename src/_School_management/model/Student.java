package _School_management.model;

public class Student extends Human{
   String classID;

    public Student(String id, String name, String birthday, int identityNumber, String classID) {
        super(id, name, birthday, identityNumber);
        this.classID = classID;
    }
    public Student(String classID){
        this.classID = classID;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }
    public String toString() {
        return String.format("%s,%s",super.toString(),classID) ;
    }
}
