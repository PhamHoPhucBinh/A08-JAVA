package ThiModule2.view;

import ThiModule2.exception.NotFoundPhoneNumber;
import ThiModule2.model.Contact;
import ThiModule2.service.ContactService;
import ThiModule2.utility.CommonUtility;
import ThiModule2.utility.Validation;


import java.util.List;
import java.util.Scanner;

import static ThiModule2.utility.CommonUtility.getChoice;
import static ThiModule2.utility.CommonUtility.inputWithOutEmpty;


public class MainMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static ContactService contactService = new ContactService();

    public static void main(String[] args) {
        while (true) {
            System.out.println("--- Main Menu ---");
            System.out.println("1. Display\n2. Add \n3. Edit \n4. Delete \n5. Search  \n6. Exit");
            int choice = getChoice(1, 6);

            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    add();
                    break;
                case 3:
//                    edit();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void display() {
        displayContact(contactService.getAllContact());
    }

    private static void displayContact(List<Contact> contacts) {
        if (contacts.size() > 0) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %20s %n", "Phone Number", "Name", "Group", "Sexual", "Adress", "Birthday", "Email");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");

            for (Contact c : contacts) {
                System.out.printf("%-20s %-20s %-30s %20s %n", c.getPhoneNumber(), c.getName(), c.getGroup(),
                        c.getSexual(), c.getAdress(), c.getBirthday(), c.getEmail());
            }
        } else {
            System.out.println("Empty list...");
        }
    }

    private static void add() {
        String phoneNumber = getPhoneNumberWithoutExist();
        while (!Validation.isPhoneNumber(phoneNumber)) {
            phoneNumber = inputWithOutEmpty("Invalid format. Please input again");
        }
        String group = inputWithOutEmpty("input Group");

        String name = inputWithOutEmpty("input Name");
        while (!Validation.isName(name)) {
            name = inputWithOutEmpty("Invalid format. Please input again");
        }
        System.out.println("Which is sexcual? Male / Female ");
        String sexual = inputWithOutEmpty("Input Sexual");
        while (!Validation.isSexual(sexual)) {
            sexual = inputWithOutEmpty("Invalid format. Please input again");
        }
        String adress = inputWithOutEmpty("Input Adress");
        System.out.println("Birthday format xx-yy-zzzz");
        String birthDay = inputWithOutEmpty("Input BirthDay");
        while (!Validation.isBirthday(birthDay)) {
            birthDay = inputWithOutEmpty("Invalid format. Please input again");
        }
        System.out.println("email format a@b.com");
        String email = inputWithOutEmpty("input email");
        while (!Validation.isEmail(email)) {
            email = inputWithOutEmpty("Invalid format. Please input again");
        }
        Contact contact = new Contact(phoneNumber, group, name, sexual, adress, birthDay, email);
        contactService.create(contact);

    }

    private static String getPhoneNumberWithoutExist() {
        String phoneNumber = null;
        do {
            phoneNumber = inputWithOutEmpty(phoneNumber != null ? "Phone Number exists. Please input again" : "Phone Number");
        } while (contactService.findByNumber(phoneNumber));

        return phoneNumber;
    }

    //    private static void delete() {
//        boolean check = false;
//
//        do {
//            String phoneNumber = CommonUtility.inputWithOutEmpty(check ? "Enter phone number again" : "Enter phone number to delete");
//
//            try {
//                contactService.delete(phoneNumber);
//                System.out.println("Deleted successfully");
//                check = false;
//            } catch (NotFoundPhoneNumber e) {
//                System.out.println(e.getMessage());
//                check = true;
//            }
//        } while (check);
//    }
    private static void search() {
        System.out.printf("1. Enter phone number / 2. name to search:");
//        int choice = getChoice(1, 2);
//        switch (choice) {
//            case 1:
//                String phoneNumber = scanner.nextLine();
//                List<Contact> contacts = contactService.searchByPhoneNumber(phoneNumber);
//                if (contacts.size() == 0) {
//                    System.out.println("No Contact exists");
//                } else {
//                    contacts.forEach(System.out::println);
//                }
//                break;
//            case 2:
//                String name = scanner.nextLine();
//                List<Contact> contacts1 = contactService.searchByName(name);
//                if (contacts1.size() == 0) {
//                    System.out.println("No Contact exists");
//                }else {
//                    contacts1.forEach(System.out::println);
//                }
//                break;
//        }
        String phoneNumber = scanner.nextLine();
        List<Contact> contacts = contactService.searchByPhoneNumber(phoneNumber);
        if (contacts.size() == 0) {
            System.out.println("No Contact exists");
        } else {
            contacts.forEach(System.out::println);
        }
    }

    private static void deleteWithConfirm(ContactService contactService, String phoneNumber) throws NotFoundPhoneNumber {
        System.out.println("Are you sure to delete this item:\n1. Yes\n2. No");
        int choice = getChoice(1, 2);
        if (choice == 1) {
            contactService.delete(phoneNumber);
            System.out.println("Deleted successfully!");
        }
//        } else {
//            System.exit(0);
//        }
    }

    private static void delete() {
        try {
            System.out.printf("Enter phone number to delete:");
            String phoneNumber = scanner.nextLine();

            if (contactService.findByNumber(phoneNumber)) {
                deleteWithConfirm(contactService, phoneNumber);
            } else {
                System.out.println("No exists this Phone Number !!!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
