package _School_management.View;


import _School_management.service.HumanService;

import java.util.List;
import java.util.Scanner;

import static _School_management.utilities.commonUtil.getChoice;


public class Mainmenu {
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
        System.out.println("1. Student \n2. Teacher)\n");
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
}
