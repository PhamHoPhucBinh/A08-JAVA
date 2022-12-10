package _my_CaseStudy.controllers;


import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch,ch2;
        char wish;
        x:
        do{

            System.out.println("\nEnter your choice :\n1.Employee Management \n2.Customer Management \n3.Facility Management \n4.Booking Management \n5.Promotion Management \n6.Exit\n");
            ch = sc.nextInt();
            switch(ch){
                case 1: System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room \n4.Deluxe Single Room\n");
                    ch2 = sc.nextInt();
//                    Hotel.features(ch2);
                    break;
                case 2:System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
                    ch2 = sc.nextInt();
//                    Hotel.availability(ch2);
                    break;
                case 3:System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
                    ch2 = sc.nextInt();
//                    Hotel.bookroom(ch2);
                    break;


    }
}
