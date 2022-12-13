package _12_Java_collection_framwork.excercice;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {

    static void display(ArrayList<Product> al) {
        System.out.println("\n--------------Product List---------------\n");
        System.out.printf("%-10s%-15s%-10s%-20s%n", "ID", "Name", "Brand", "amount");
        for (Product e : al) {
            System.out.printf("%-5s%-20s%-10s%-15s%n", e.productID, e.productname, e.amount, e.brand);
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        String productID;
        String productname;
        int amount;
        String brand;

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> al = new ArrayList<Product>();

        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
//        try{
//
//            f = new File("N:/Java Work Space/Eclipse Programs/Employee Management Tool/src/EmployeeDataList1.txt");
//            if(f.exists())
//            {
//                fis = new FileInputStream(f);
//                ois = new ObjectInputStream(fis);
//                al = (ArrayList<Product>)ois.readObject();
//            }
//
//        }
//        catch(Exception exp){
//            System.out.println(exp);
//        }
        do {
            System.out.println("\n*********Welcome to the Product Management System**********\n");
            System.out.println("1). Add Product to the DataBase\n" +
                    "2). Search for Product\n" +
                    "3). Edit Product details\n" +
                    "4). Delete Product Details\n" +
                    "5). Display all Product in warehouse\n" +
                    "6). EXIT\n");
            System.out.println("Enter your choice : ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("\nEnter the following details to ADD list:\n");
                    System.out.println("Enter ID :");
                    productID = sc.next();
                    System.out.println("Enter Name :");
                    productname = sc.next();
                    System.out.println("Enter Brand :");
                    brand = sc.next();
                    System.out.println("Enter amount in warehouse :");
                    amount = sc.nextInt();


                    al.add(new Product(productID, productname, amount, brand));
                    display(al);
                    break;

                case 2:
                    System.out.println("Enter the Product ID to search :");
                    productID = sc.next();
                    int i = 0;
                    for (Product e : al) {
                        if (productID.equals(e.productID)) {
                            System.out.println(e + "\n");
                            i++;
                        }
                    }
                    if (i == 0) {
                        System.out.println("\nProduct Details are not available, Please enter a valid ID!!");
                    }
                    break;

                case 3:
                    System.out.println("\nEnter the Product ID to EDIT the details");
                    productID = sc.next();
                    int j = 0;
                    for (Product e : al) {
                        if (productID.equals(e.productID)) {
                            j++;
                            do {
                                int ch1 = 0;
                                System.out.println("\nEDIT Product Details :\n" +
                                        "1). Product ID\n" +
                                        "2). Product Name\n" +
                                        "3). Amount in warehouse\n" +
                                        "4). Brand.\n" +
                                        "5). Go back.\n");
                                System.out.println("Enter your choice : ");
                                ch1 = sc.nextInt();
                                switch (ch1) {
                                    case 1:
                                        System.out.println("\nEnter new Product ID:");
                                        e.productID = sc.next();
                                        System.out.println(e + "\n");
                                        break;

                                    case 2:
                                        System.out.println("Enter new Product Name:");
                                        e.productname = sc.nextLine();
                                        System.out.println(e + "\n");
                                        break;

                                    case 3:
                                        System.out.println("Enter new amount of product:");
                                        e.amount = sc.nextInt();
                                        System.out.println(e + "\n");
                                        break;

                                    case 4:
                                        System.out.println("Enter new Product Brand :");
                                        e.brand = sc.next();
                                        System.out.println(e + "\n");
                                        break;


                                    case 5:
                                        j++;
                                        break;

                                    default:
                                        System.out.println("\nEnter a correct choice from the List :");
                                        break;

                                }
                            }
                            while (j == 1);
                        }
                    }
                    if (j == 0) {
                        System.out.println("\nProduct Details are not available, Please enter a valid ID!!");
                    }

                    break;

                case 4:
                    System.out.println("\nEnter Product ID to DELETE from the Databse :");
                    productID = sc.next();
                    int k = 0;
                    try {
                        for (Product e : al) {
                            if (productID.equals(e.productID)) {
                                al.remove(e);
                                display(al);
                                k++;
                            }
                        }
                        if (k == 0) {
                            System.out.println("\nProduct details are not available, Please enter a valid ID!!");
                        }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    break;

                case 5:
                    try {
                        al = (ArrayList<Product>) ois.readObject();

                    } catch (ClassNotFoundException e2) {

                        System.out.println(e2);
                    } catch (Exception e2) {

                        System.out.println(e2);
                    }
                    display(al);
                    break;

                case 6:
                    try {
                        fos = new FileOutputStream(f);
                        oos = new ObjectOutputStream(fos);
                        oos.writeObject(al);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    } finally {
                        try {
                            fis.close();
                            ois.close();
                            fos.close();
                            oos.close();
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }

                    }
                    System.out.println("\nYou have chosen EXIT !! Saving Files and closing the tool.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nEnter a correct choice from the List :");
                    break;

            }
        }
        while (true);
    }

}
