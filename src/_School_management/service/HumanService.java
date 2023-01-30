package _School_management.service;

import _School_management.Exception.NotFoundHumanID;
import _School_management.utilities.commonUtil;
import _School_management.utilities.constant;
import _School_management.model.Human;
import _School_management.model.Student;
import _School_management.model.Teacher;
import _School_management.utilities.FileHelper;
import _School_management.utilities.constant.Certification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class HumanService {
    private List<Student> students;
    private List<Teacher> teachers;

    private FileHelper<Student> fileStudent = new FileHelper<>();
    private FileHelper<Teacher> fileTeacher = new FileHelper<>();

    public HumanService(){
        students = toStudents();
        teachers = toTeachers();
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
            fileStudent.write(constant.FilePath.Student, students, false);
        } else if (human instanceof Teacher t) {
            teachers.add(t);
            fileTeacher.write(constant.FilePath.Teacher, teachers, false);
        }
    }
    public boolean findById(String id) {
        return Stream.of(students, teachers).flatMap(Collection::stream).anyMatch(e -> e.getId().equals(id));
    }
    public boolean delete(String id) throws NotFoundHumanID {
        if (students.removeIf(e -> e.getId().equals(id))) {
            fileStudent.write(constant.FilePath.Student, students, false);
            return true;
        }

        if (teachers.removeIf(e -> e.getId().equals(id))) {
            fileTeacher.write(constant.FilePath.Teacher, teachers, false);
            return true;
        }

        throw new NotFoundHumanID("this ID is not existed");
    }
    public List<? extends Human> search(String id) {
        return Stream.of(students, teachers).flatMap(Collection::stream).filter(e -> e.getId().contains(id)).toList();
    }
    private List<Student> toStudents() {
        List<Student> res = new ArrayList<>();
        List<String> lines = fileStudent.read(constant.FilePath.Student);

        for (String line : lines) {
            String[] tmp = line.split(",");

            String id = tmp[0];
            String name = tmp[1];
            String birthday = tmp[2];
            int identityNumber = Integer.parseInt(tmp[3]);
            String classID = tmp[4];

            Student student = new Student(id,name,birthday,identityNumber,classID);
            res.add(student);
        }
        return res;
    }
    private List<Teacher> toTeachers() {
        List<Teacher> res = new ArrayList<>();
        List<String> lines = fileTeacher.read(constant.FilePath.Teacher);

        for (String line : lines) {
            String[] tmp = line.split(",");
            String id = tmp[0];
            String name = tmp[1];
            String birthday = tmp[2];
            int identityNumber = Integer.parseInt(tmp[3]);
            String certification = tmp[4];
            Double salary = Double.parseDouble(tmp[5]);
            Teacher teacher = new Teacher(id,name,birthday,identityNumber,Certification.valueOf(certification),salary);
            res.add(teacher);
        }
        return res;
    }
}
