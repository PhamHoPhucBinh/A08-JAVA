package _School_management.model;

public abstract class Human {
    String id;
    String name;
    String birthday;
    int identityNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getIdentityNumber() {
        return identityNumber;
    }
    public Human(){};

    public void setIdentityNumber(int identityNumber) {
        this.identityNumber = identityNumber;
    }

    public Human(String id, String name, String birthday, int identityNumber) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.identityNumber = identityNumber;
    }

    @Override

    public String toString() {
        return String.format("%s,%s,%s,%s",id,name,birthday,identityNumber);
    }
}
