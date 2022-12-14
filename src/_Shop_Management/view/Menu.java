package _Shop_Management.view;

import _Shop_Management.model.Domestic;
import _Shop_Management.model.IDGenerator;
import _Shop_Management.model.Imported;
import _Shop_Management.model.Product;
import _Shop_Management.service.DomesticService;
import _Shop_Management.service.IDGenerater;
import _Shop_Management.service.ImportedService;
import _Shop_Management.service.ProductService;
import _Shop_Management.util.ConstantUtil;
import _Shop_Management.util.ReadWriteCSV;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static _Shop_Management.service.DomesticService.domesticArrayList;
import static _Shop_Management.service.ImportedService.importedArrayList;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static DomesticService domesticService = new DomesticService();
    private static ImportedService importedService = new ImportedService();


    private static int getChoice() {
        System.out.printf("Enter your choice:");
        return Integer.parseInt(scanner.nextLine());
    }


    public void DisplayMenu() {
        boolean flag = true;
        char wish;
        x:
        do {
            System.out.println("Welcome to Product Management Software");
            System.out.println("______________________________________");
            System.out.println("Choose the functions below : " +
                    "\n 1. Display product." +
                    "\n 2. Add product." +
                    "\n 3. Delete Product." +
                    "\n 4. Edit product." +
                    "\n 5. Find product by ID. " +
                    "\n 6. Exit. ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("your choice is : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
//                    edit();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    System.exit(0);
                    break x;
            }
            System.out.println("\nContinue : (y/n)");
            wish = scanner.next().charAt(0);
            if (!(wish == 'y' || wish == 'Y' || wish == 'n' || wish == 'N')) {
                System.out.println("Invalid Option");
                System.out.println("\nContinue : (y/n)");
                wish = scanner.next().charAt(0);
            }

        } while (wish == 'y' || wish == 'Y');

    }


    ////DISPLAY
    public static void display() {
        System.out.println("1. Domestic Product \n2. Imported Product \n3. Back ");
        int choice = getChoice();
        switch (choice) {
            case 1: {
//                System.out.println("\n--------------Domestic Product List---------------\n");
//                System.out.println(String.format("%-15s%-20s%-10s%-15s%-10s", "ID", "Name", "Price", "Manufacturer", "Warranty"));
                domesticService.displayDomesticProduct();
//                List<Domestic> domesticList = ReadWriteCSV.readDomesticProductFromCSV("src/_Shop_Management/data/DOMESTIC_FILE.csv");

//                List<Domestic> domesticList = domesticService.findAll();
//                for (Domestic e : domesticList) {
//                    System.out.println(String.format("%-15s%-20s%-10s%-15s%-10s", e.getProductID(), e.getProductName(), e.getPrice(), e.getManufacturer(), e.getWarrantyPeriod()));
//                }
                break;
            }
            case 2: {
                System.out.println("\n--------------Imported Product List---------------\n");
                System.out.println(String.format("%-15s%-20s%-10s%-15s%-10s", "ID", "Name", "Price", "Manufacturer", "Country", "Status"));
                List<Imported> importedList = importedService.findAll();
                for (Imported e : importedList) {
                    System.out.println(String.format("%-15s%-20s%-10s%-15s%-10s", e.getProductID(), e.getProductName(), e.getPrice(), e.getManufacturer(), e.getCountry(), e.getProductStatus()));
                }
                break;
            }
            case 3: {
                //back to mainmenu code
                System.exit(0);
                break;
            }
        }
    }


    ///ADD
    public static void add() {
        System.out.println("1. Domestic Product \n2. Imported Product \n3. Back ");
        int choice = getChoice();


        IDGenerator generator = new IDGenerator();


        System.out.printf("Product Name:");
        String productName = scanner.nextLine();

        System.out.printf("Manufacturer:");
        String manufacturer = scanner.nextLine();


        System.out.printf("Price : ");
        Double price = Double.parseDouble(scanner.nextLine());


        switch (choice) {
            case 1: {
                System.out.printf("Warranty Period:");
                String warrantyPeriod = scanner.nextLine();
                String previousID;
                if (domesticArrayList.size() > 0) {
                    Domestic domesticLast = domesticArrayList.get(domesticArrayList.size() - 1);
                    int tmp = Integer.parseInt(domesticLast.getProductID().replace(ConstantUtil.Prefix, "").replace(ConstantUtil.SuffixDomestic, ""));
                    generator.init(ConstantUtil.Prefix, ConstantUtil.SuffixDomestic, tmp);
                } else {
                    generator.init(ConstantUtil.Prefix, ConstantUtil.SuffixDomestic, 0);
                }
                previousID = generator.generate();
                Domestic domestic = new Domestic(previousID, productName, price, manufacturer, warrantyPeriod);
                domesticService.create(domestic);
                ReadWriteCSV.writeDomesticCSV("src/_Shop_Management/data/DOMESTIC_FILE.csv", domesticArrayList, true);

                break;
            }
            case 2: {

                System.out.printf("Country:");
                String country = scanner.nextLine();
                System.out.printf("Product Status:");
                System.out.println("Type the status below : preparing / shipping / arrived");
                String productStatus = scanner.nextLine();

//                String productStatus;
//                do {
//                    productStatus = scanner.nextLine();
//                } while (productStatus.matches("prepraring") || productStatus.matches("shipping") || productStatus.matches("arrived"));
//
//                System.out.println("invalid input,pls re-type !!");

                String previousID;
                if (importedArrayList.size() > 0) {
                    Imported importedLast = importedArrayList.get(importedArrayList.size() - 1);
                    int tmp = Integer.parseInt(importedLast.getProductID().replace(ConstantUtil.Prefix, "").replace(ConstantUtil.SuffixImported, ""));
                    generator.init(ConstantUtil.Prefix, ConstantUtil.SuffixImported, tmp);
                } else {
                    generator.init(ConstantUtil.Prefix, ConstantUtil.SuffixImported, 0);
                }
                previousID = generator.generate();
                Imported imported = new Imported(previousID, productName, price, manufacturer, country, ConstantUtil.ProductStatus.valueOf(productStatus));
                importedService.create(imported);
                ReadWriteCSV.writeImportedCSV("src/_Shop_Management/data/IMPORTED_FILE.csv", importedArrayList, true);

                break;
            }
            case 3: {
                System.exit(0);
                break;
            }
        }

        System.out.println("Created successfully!");
    }


    /////DEL
    private static void delete() {
        try {
            System.out.printf("Enter product ID to delete:");
            String productID = scanner.nextLine();

            if (domesticService.findByID(productID)) {
                deleteWithConfirm(domesticService, productID);
            } else if (importedService.findByID(productID)) {
                deleteWithConfirm(importedService, productID);
            } else {
                System.out.println("No exists this ID !!!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void deleteWithConfirm(ProductService productService, String productID) {
        System.out.println("Are you sure to delete this item:\n1. Yes\n2. No");
        int choice = getChoice();
        if (choice == 1) {
            productService.delete(productID);
            System.out.println("Deleted successfully!");
        } else {
            System.exit(0);
        }
    }

    ///Search by ID
    private static void search() {
        System.out.printf("Enter product ID to search:");
        String productID = scanner.nextLine();

        List<Domestic> domesticList = domesticService.search(productID);
        List<Imported> importedList = importedService.search(productID);


        if (domesticList.size() == 0 && importedList.size() == 0) {
            System.out.println("this product ID do not exists");
        } else {
            domesticList.forEach(System.out::println);
            importedList.forEach(System.out::println);

        }
    }
}

