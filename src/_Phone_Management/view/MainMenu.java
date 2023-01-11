package _Phone_Management.view;

import _Phone_Management.model.Brand;
import _Phone_Management.model.BrandNew;
import _Phone_Management.model.SecondHand;
import _Phone_Management.service.BrandNewService;
import _Phone_Management.service.BrandService;
import _Phone_Management.service.PhoneService;
import _Phone_Management.service.SecondHandService;
import _Phone_Management.util.ConstantUtil;
import java.util.List;
import java.util.Scanner;
import static _Phone_Management.util.Validate.*;


public class MainMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static BrandNewService brandNewService = new BrandNewService();
    private static SecondHandService secondHandService = new SecondHandService();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Wellcome to Phone Management System");
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

    public static void add() {
        System.out.println("What type of Phone you wanna ADD ?");
        System.out.println("1. Brand New Phone\n2. 2nd Hand Phone");
        int choice = getChoice(1, 2);
        String id = inputWithOutEmpty("Phone ID");

        String phoneName = inputWithOutEmpty("Phone Name");

        System.out.println("--- List Brand ---");
        BrandService brandService = new BrandService();
        List<Brand> brandList = brandService.findAll();

        try {
            for (int i = 0; i < brandList.size(); i++) {
                System.out.println(brandList.get(i));
            }
            String brandName = inputWithOutEmpty("Input your Brand Name ");
            Brand brand = brandService.findByName(brandName);

            int price = inputToInteger("Price");

            int amount = inputToInteger("Amount in warehouse");

            switch (choice) {
                case 1: {
                    System.out.printf("Store:");
                    String store = scanner.nextLine();

                    BrandNew brandNew = new BrandNew(id, phoneName, brand, price, amount, ConstantUtil.Store.valueOf(store));
                    brandNewService.create(brandNew);
                    System.out.println("add sucessfully!");
                    break;
                }
                case 2: {
                    String warranty = inputWithOutEmpty("Warranty remaining");
                    System.out.printf("Type of Phone:");
                    String typeOfPhone = scanner.nextLine();
//                    ConstantUtil.TypeOfPhone typeOfPhone = validate.inputToEnum(ConstantUtil.TypeOfPhone.class,"Type of Phone");

//                    SecondHand secondHand = new SecondHand(id, phoneName, brand, price, amount, warranty, typeOfPhone);
                    SecondHand secondHand = new SecondHand(id, phoneName, brand, price, amount, warranty, ConstantUtil.TypeOfPhone.valueOf(typeOfPhone));
                    secondHandService.create(secondHand);
                    System.out.println("add sucessfully!");
                    break;
                }
            }
        } catch (Exception e) {
        }
    }

    public static void display() {
        System.out.println("1. BrandNew Phone \n2. 2ndHand Phone");
        int choice = getChoice(1, 2);
        switch (choice) {
            case 1: {
                List<BrandNew> brandNewList = brandNewService.findAll();
                displayBrandNew(brandNewList);
            }
            case 2: {
                List<SecondHand> secondHandList = secondHandService.findAll();
                displaySecondHand(secondHandList);
            }
        }
    }

    private static void delete() {

        System.out.printf("Enter Phone ID to delete:");
        String id = scanner.nextLine();
        if (brandNewService.findByID(id)) {
            deleteWithConfirm(brandNewService, id);
        } else if (secondHandService.findByID(id)) {
            deleteWithConfirm(secondHandService, id);
        } else {
            System.out.println("This Phone ID doesn't exist");
        }
    }


    private static void deleteWithConfirm(PhoneService phoneService, String id) {
        System.out.println("Are you sure to delete this item:\n1. Yes\n2. No");
        int choice = getChoice(1, 2);
        if (choice == 1) {
            phoneService.delete(id);
            System.out.println("Deleted successfully!");
        } else {
            main(null);
        }
    }

    private static void search() {
        System.out.printf("Enter phone ID to search:");
        String id = scanner.nextLine();

        List<BrandNew> brandNewList = brandNewService.search(id);
        List<SecondHand> secondHandList = secondHandService.search(id);


        if (brandNewList.size() == 0 && secondHandList.size() == 0) {
            System.out.println("No driver plate exists");
        } else {
            brandNewList.forEach(System.out::println);
            secondHandList.forEach(System.out::println);
        }
    }


//    private static int getChoice() {
//        System.out.printf("Enter your choice:");
//        return Integer.parseInt(scanner.nextLine());
//    }

    private static void displayBrandNew(List<BrandNew> brandNewList) {
        System.out.printf("%-20s %-20s %-30s %-20s %-20s %20s %n", "ID", "PHONE NAME", "BRAND", "PRICE", "AMOUNT", "STORE");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        if (brandNewList.size() > 0) {
            for (BrandNew b : brandNewList) {
                System.out.printf("%-20s %-20s %-30s %-20s %-20s %20s %n", b.getId(), b.getPhoneName(), b.getBrand().getBrandName(), b.getPrice(), b.getAmount(), b.getStore());
            }
        } else {
            System.out.println("empty list!");
        }
    }

    private static void displaySecondHand(List<SecondHand> secondHandList) {
        System.out.printf("%-20s %-20s %-30s %-20s %-20s -%20s %20s %n", "ID", "PHONE NAME", "BRAND", "PRICE", "AMOUNT", "WARRANTY", "TYPE");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        if (secondHandList.size() > 0) {
            for (SecondHand s : secondHandList) {
                System.out.printf("%-20s %-20s %-30s %-20s %-20s -%20s %20s %n", s.getId(), s.getPhoneName(), s.getBrand().getBrandName(), s.getPrice(), s.getAmount(), s.getWarrantyRemain(), s.getTypeOfPhone());
            }
        } else {
            System.out.println("empty list!");
        }
    }
}
