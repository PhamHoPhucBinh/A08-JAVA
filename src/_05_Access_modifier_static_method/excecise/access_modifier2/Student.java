package _05_Access_modifier_static_method.excecise.access_modifier2;

public class Student {
    private String name = " John";
    private String classes = "A08";

    Student() {
    }

    ;

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
