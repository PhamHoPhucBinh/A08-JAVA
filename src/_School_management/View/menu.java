package _School_management.View;

import _School_management.Exception.NotFoundHumanID;
import _School_management.model.*;
import _School_management.service.*;
import _School_management.utilities.constant.*;
import _School_management.utilities.validation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static _School_management.utilities.commonUtil.getChoice;
import static _School_management.utilities.commonUtil.inputToDouble;
import static _School_management.utilities.commonUtil.inputToInteger;
import static _School_management.utilities.commonUtil.inputWithOutEmpty;

public class menu {
    private static Scanner scanner = new Scanner(System.in);
    private static HumanService humanService = new HumanService();

    public static void main(String[] args) {
        while (true) {
            System.out.println("--- Main Menu ---");
            System.out.println("1. Add\n2. Display\n3. Delete\n4. Search\n5. Exit");
            int choice = getChoice(1, 5);

            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void display() {
        System.out.println("1. Student \n2. Teacher");
        int choice = getChoice(1, 2);
        switch (choice) {
            case 1:
                displayStudent(humanService.getAllStudent());
                break;
            case 2:
                displayTeacher(humanService.getAllTeacher());
                break;
        }
    }

    private static void displayStudent(List<Student> students) {
        if (students.size() > 0) {
            System.out.printf("%-20s %-20s %-30s %20s %n", "Student ID", "Name", "Birthday", "ID number", "Class ID");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");

            for (Student s : students) {
                System.out.printf("%-20s %-20s %-30s %20s %n", s.getId(), s.getName(), s.getBirthday(), s.getIdentityNumber(), s.getClassID());
            }
        } else {
            System.out.println("Empty list...");
        }
    }

    private static void displayTeacher(List<Teacher> teachers) {
        if (teachers.size() > 0) {
            System.out.printf("%-20s %-20s %-30s %-20s %20s %n", "Teacher ID", "Name", "Birthday", "ID number", "Certification", "Salary");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");

            for (Teacher t : teachers) {
                System.out.printf("%-20s %-20s %-30s %-20s %20s %n", t.getId(), t.getName(), t.getBirthday(), t.getIdentityNumber(), t.getCertification(), t.getSalary());
            }
        } else {
            System.out.println("Empty list...");
        }
    }

    private static void add() {
        System.out.println("1. Student \n2. Teacher ");
        int choice = getChoice(1, 2);
        String id = "";
        switch (choice) {
            case 1:
                id = getIDWithoutExist();
                while (!validation.isStudentID(id)) {
                    id = inputWithOutEmpty("Invalid format. Please input again");
                }
                break;
            case 2:
                id = getIDWithoutExist();
                while (!validation.isTeacherID(id)) {
                    id = inputWithOutEmpty("Invalid format. Please input again");
                }
        }
        String name = inputWithOutEmpty("input Name");
        while (!validation.isName(name)) {
            name = inputWithOutEmpty("Invalid format. Please input again");
        }
        String birthday = inputWithOutEmpty("input allow form xx-yy-zzzz");
        while (!validation.isBirthday(birthday)) {
            birthday = inputWithOutEmpty("Invalid format. Please input again");
        }
        int identityNumber = inputToInteger("input the ID Number");

        Human human = null;
        switch (choice) {
            case 1:
                String classID = inputWithOutEmpty("input class id");
                human = new Student(id, name, birthday, identityNumber, classID);
                break;
            case 2:
                String certification = inputWithOutEmpty("input certification");
                Double salary = inputToDouble("Teacher's salary");
                human = new Teacher(id, name, birthday, identityNumber, certification, salary);
                break;
        }
        humanService.create(human);
        System.out.println("Created successfully!");
    }

    private static String getIDWithoutExist() {
        String id = null;
        do {
            id = inputWithOutEmpty(id != null ? "ID exists. Please input again:" : "ID");
        } while (humanService.findById(id));

        return id;
    }

    private static void delete() {
        boolean check = false;

        do {
            String id = inputWithOutEmpty(check ? "Enter id again" : "Enter id to delete");

            try {
                humanService.delete(id);
                System.out.println("Deleted successfully");
                check = false;
            } catch (NotFoundHumanID e) {
                System.out.println(e.getMessage());
                check = true;
            }
        } while (check);
    }

    private static void search() {
        String id = inputWithOutEmpty("Enter driver plate to search");

        List<? extends Human> humans = humanService.search(id);

        if (humans.size() == 0) {
            System.out.println("No ID exists");
        } else {
            humans.forEach(e -> {
                if (e instanceof Student s) {
                    displayStudent(List.of(s));
                } else {
                    displayTeacher(List.of((Teacher) e));
                }
            });
        }
    }
}
