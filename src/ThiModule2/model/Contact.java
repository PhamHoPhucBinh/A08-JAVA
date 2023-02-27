package ThiModule2.model;

public class  Contact {
    String phoneNumber;
    String group;
    String name;
    String sexual;
    String adress;
    String birthday;
    String email;

    public Contact(String phoneNumber, String group, String name, String sexual, String adress, String birthday, String email) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.name = name;
        this.sexual = sexual;
        this.adress = adress;
        this.birthday = birthday;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexual() {
        return sexual;
    }

    public void setSexual(String sexual) {
        this.sexual = sexual;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",phoneNumber,group,name,sexual,adress,birthday,email);
    }
}
