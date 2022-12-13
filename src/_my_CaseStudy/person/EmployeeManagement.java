package _my_CaseStudy.person;

import _12_Java_collection_framwork.excercice.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EmployeeManagement {
    static void display(ArrayList<Employee> al) {
        System.out.println("\n--------------Product List---------------\n");
        System.out.printf("%-10s%-15s%-10s%-20s%n", "eCode", "Name", "DoB", "gender", "contact", "email", "degree", "position", "salary");
        for (Employee e : al) {
            System.out.printf("%-5s%-20s%-10s%-15s%n", e.employeeCode, e.name, e.dayOfBirth, e.gender, e.contact, e.email, e.degree, e.position, e.salary);
        }
    }

    public static void main(String[] args) {
        int employeeCode;
        String name;
        String dayOfBirth;
        String gender;
        long contact;
        String email;
        String degree;
        String position;
        float salary;

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> al = new ArrayList<Employee>();

        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        int i = 0;
        switch (i) {
            case 1:
                try {
                    al = (ArrayList<Employee>) ois.readObject();

                } catch (ClassNotFoundException e2) {

                    System.out.println(e2);
                } catch (Exception e2) {

                    System.out.println(e2);
                }
                display(al);
                break;
            case 2:
                System.out.println("\nEnter the following details to ADD list:\n");
                System.out.println("Enter ID :");
                employeeCode = sc.nextInt();
                System.out.println("Enter Name :");
                name = sc.next();
                System.out.println("Enter Birthday :");
                dayOfBirth = sc.next();
                System.out.println("Choose Gender :");
                gender = sc.next();
                System.out.println("Choose contact :");
                contact = sc.nextLong();
                System.out.println("Choose email :");
                email = sc.next();
                System.out.println("Choose degree :");
                degree = sc.next();
                System.out.println("Choose position :");
                position = sc.next();
                System.out.println("Choose salary :");
                salary = sc.nextLong();

                al.add(new Employee(employeeCode, name, dayOfBirth, gender, contact, email, degree,position, salary));
                display(al);
                break;
            case 3:
                System.out.println("\nEnter the Employee CODE to EDIT the details");
                employeeCode = sc.nextInt();
                int j = 0;
                for (Employee e : al) {
                    if (employeeCode == e.employeeCode) {
                        j++;
                        do {
                            int ch1 = 0;
                            System.out.println("\nEDIT Employee Details :\n" +
                                    "1). Employee Code \n" +
                                    "2). Employee Name\n" +
                                    "3). Birthday\n" +
                                    "4). Gender.\n" +
                                    "5). Contact.\n" +
                                    "6). Email.\n" +
                                    "7). Degree.\n" +
                                    "8). Salary.\n" +
                                    "9). Go back.\n");
                            System.out.println("Enter your choice : ");
                            ch1 = sc.nextInt();
                            switch (ch1) {
                                case 1:
                                    System.out.println("\nEnter new Employee Code:");
                                    e.employeeCode = sc.nextInt();
                                    System.out.println(e + "\n");
                                    break;

                                case 2:
                                    System.out.println("Enter new Employee's Name:");
                                    e.name = sc.nextLine();
                                    System.out.println(e + "\n");
                                    break;

                                case 3:
                                    System.out.println("Enter new Employee's Birthday:");
                                    e.dayOfBirth = sc.next();
                                    System.out.println(e + "\n");
                                    break;

                                case 4:
                                    System.out.println("Enter new Employee's Gender:");
                                    e.gender = sc.next();
                                    System.out.println(e + "\n");
                                    break;
                                case 5:
                                    System.out.println("Enter new Employee's Contact :");
                                    e.contact = sc.nextInt();
                                    System.out.println(e + "\n");
                                    break;
                                case 6:
                                    System.out.println("Enter new Employee's Email :");
                                    e.email = sc.next();
                                    System.out.println(e + "\n");
                                    break;
                                case 7:
                                    System.out.println("Enter new Employee's Degree :");
                                    e.degree = sc.next();
                                    System.out.println(e + "\n");
                                    break;
                                case 8:
                                    System.out.println("Enter new Employee's Position :");
                                    e.position = sc.next();
                                    System.out.println(e + "\n");
                                    break;
                                case 9:
                                    System.out.println("Enter new Employee's Salary :");
                                    e.position = sc.next();
                                    System.out.println(e + "\n");
                                    break;

                                case 10:
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
                employeeCode = sc.nextInt();
                int k = 0;
                try {
                    for (Employee e : al) {
                        if (employeeCode== e.employeeCode) {
                            al.remove(e);
                            display(al);
                            k++;
                        }
                    }
                    if (k == 0) {
                        System.out.println("\nEmployee Details are not available, Please enter a valid Code !!");
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                break;
            case 5:
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
}