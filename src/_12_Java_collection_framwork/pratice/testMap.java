package _12_Java_collection_framwork.pratice;

import java.util.*;

public class testMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Binh", 30);
        hashMap.put("An", 07);
        hashMap.put("Hanh", 100);

        System.out.println("output");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

        System.out.println("****LinkedHashMap****");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
        System.out.println(linkedHashMap.get("An"));

        StudenttestMap student1 = new StudenttestMap("An", 50, "abc");
        StudenttestMap student2 = new StudenttestMap("Vinh", 06, "def");
        StudenttestMap student3 = new StudenttestMap("Lan", 199, "ghj");

        Map<Integer, StudenttestMap> studenttestMapMap = new HashMap<Integer, StudenttestMap>();
        studenttestMapMap.put(1, student1);
        studenttestMapMap.put(2, student2);
        studenttestMapMap.put(3, student3);
        for (Map.Entry<Integer, StudenttestMap> student : studenttestMapMap.entrySet()) {
            System.out.println(student.toString());

        }
//        Set<StudenttestMap> studenttestMaps = new HashSet<StudenttestMap>();
//        studenttestMaps.add(student1);
//        studenttestMaps.add(student2);
//        studenttestMaps.add(student3);
//
//
//        for (StudenttestMap student : studenttestMaps) {
//            System.out.println(student.toString());
//        }
    }
}

class StudenttestMap {
    private String name;
    private int age;
    private String school;

    public StudenttestMap() {
    }

    ;

    public StudenttestMap(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String toString() {
        return name + "," + age + "," + school;
    }
}