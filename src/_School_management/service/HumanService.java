package _School_management.service;

import _Resort_Management.Exception.NotFoundVillaID;
import _Resort_Management.Ultility.ConstantUltilities;
import _Resort_Management.model.Villa;
import _School_management.model.Human;
import _School_management.model.Student;
import _School_management.model.Teacher;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class HumanService {
    private List<Student> students;
    private List<Teacher> teachers;

    private FileHelper<Student> fileStudent = new FileHelper<>();
    private FileHelper<Teacher> fileTeacher = new FileHelper<>();

    public HumanService(){
        students = toStudent();
        teachers = toTeacher();
    }

    public List<Student> getAllStudent() {
        return students;
    }
    public List<Teacher> getAllTeacher() {
        return teachers;
    }

    public void create(Human human) {
        if (human instanceof Student s) {
            students.add(s);
            fileStudent.write(ultilities.FilePath.Student, students, false);
        } else if (human instanceof Teacher t) {
            teachers.add(t);
            fileTeacher.write(ultilities.FilePath.Teacher, teachers, false);
        }
    }
    public boolean findById(String id) {
        return Stream.of(students, teachers).flatMap(Collection::stream).anyMatch(e -> e.getId().equals(id));
    }
    public boolean delete(String id) throws NotFoundHumanID {
        if (students.removeIf(e -> e.getId().equals(id))) {
            fileStudent.write(ultilities.FilePath.Student, students, false);
            return true;
        }

        if (teachers.removeIf(e -> e.getId().equals(id))) {
            fileTeacher.write(ultilities.FilePath.Teacher, teachers, false);
            return true;
        }

        throw new NotFoundHumanID("this ID is not existed");
    }
    public List<? extends Human> search(String id) {
        return Stream.of(students, teachers).flatMap(Collection::stream).filter(e -> e.getId().contains(id)).toList();
    }


}
