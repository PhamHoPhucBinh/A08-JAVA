package _Resort_Management.view;

import _Resort_Management.model.House;
import _Resort_Management.model.Room;
import _Resort_Management.service.VillaService;

import java.util.List;
import java.util.Scanner;

import static _Resort_Management.Ultility.CommonUltility.getChoice;

public class MainMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static VillaService villaService = new VillaService();

    public static void main(String[] args) {
        while (true) {
            System.out.println("--- Main Menu ---");
            System.out.println("1. Add\n2. Display\n3. Delete\n4. Search\n5. Exit");
            int choice = getChoice(1,5);

            switch (choice) {
                case 1 : add();
                break;
                case 2 : display();
                break;
                case 3 : delete();
                break;
                case 4 : search();
                break;
                case 5 : System.exit(0);
                break;
            }
        }
    }
    private static void display() {
        System.out.println("1. Room \n2. House)\n") ;
        int choice = getChoice(1,2);

        switch (choice) {
            case 1 : displayRoom(villaService.getAllRoom());
            break;
            case 2 : displayHouse(villaService.getAllHouse());
            break;
        }
    }
    private static void displayRoom(List<Room> rooms){

        if(rooms.size() > 0){
            System.out.printf("%-20s %-20s %-30s %-20s %-20s %20s %n", "ID", "AREA", "PRICE", "MAXIMUM PEOPLE", "CONTRACT","FREE SERVICE");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");

            for(Room r: rooms){
                System.out.printf("%-20s %-20s %-30s %-20s %-20s %20s %n", r.getId(), r.getArea(),r.getPrice(),r.getMaxPeople(),r.getContract(),r.getFreeService());
            }
        }
        else {
            System.out.println("Empty list...");
        }
    }

    private static void displayHouse(List<House> houses){
        if(houses.size() > 0){
            System.out.printf("%-20s %-20s %-30s %-20s %-20s %-20s  %20s %n", "ID", "AREA", "PRICE", "MAXIMUM PEOPLE", "CONTRACT","Standard","Num of FLOOR");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");

            for(House h: houses){
                System.out.printf("%-20s %-20s %-30s %-20s %-20s %-20s  %20s %n", h.getId(),h.getArea(),h.getPrice(),h.getMaxPeople(),h.getContract(),h.getStandard(),h.getNumOfFloor() );
            }
        }
        else {
            System.out.println("Empty list...");
        }
    }
}
