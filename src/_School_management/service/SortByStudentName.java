package _School_management.service;

import _School_management.model.Human;
import _School_management.model.Student;

import java.util.Comparator;

public class SortByStudentName implements Comparator<Student> {
    public int compare(Student student1, Student student2){
        return student1.getName().compareTo(student2.getName());
    }
}
