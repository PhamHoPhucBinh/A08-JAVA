package _Resort_Management.view;

import _Resort_Management.Exception.NotFoundVillaID;
import _Resort_Management.Ultility.CommonUltility;
import _Resort_Management.model.House;
import _Resort_Management.model.Room;
import _Resort_Management.model.Villa;
import _Resort_Management.service.VillaService;

import java.util.List;
import java.util.Scanner;
import static _Resort_Management.Ultility.CommonUltility.*;

public class MainMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static VillaService villaService = new VillaService();

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
        System.out.println("1. Room \n2. House)\n");
        int choice = getChoice(1, 2);

        switch (choice) {
            case 1:
                displayRoom(villaService.getAllRoom());
                break;
            case 2:
                displayHouse(villaService.getAllHouse());
                break;
        }
    }

    private static void displayRoom(List<Room> rooms) {

        if (rooms.size() > 0) {
            System.out.printf("%-20s %-20s %-30s %-20s %-20s %20s %n", "ID", "AREA", "PRICE", "MAXIMUM PEOPLE", "CONTRACT", "FREE SERVICE");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");

            for (Room r : rooms) {
                System.out.printf("%-20s %-20s %-30s %-20s %-20s %20s %n", r.getId(), r.getArea(), r.getPrice(), r.getMaxPeople(), r.getContract(), r.getFreeService());
            }
        } else {
            System.out.println("Empty list...");
        }
    }

    private static void displayHouse(List<House> houses) {
        if (houses.size() > 0) {
            System.out.printf("%-20s %-20s %-30s %-20s %-20s %-20s  %20s %n", "ID", "AREA", "PRICE", "MAXIMUM PEOPLE", "CONTRACT", "Standard", "Num of FLOOR");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");

            for (House h : houses) {
                System.out.printf("%-20s %-20s %-30s %-20s %-20s %-20s  %20s %n", h.getId(), h.getArea(), h.getPrice(), h.getMaxPeople(), h.getContract(), h.getStandard(), h.getNumOfFloor());
            }
        } else {
            System.out.println("Empty list...");
        }
    }

    private static String getIdWithoutExists() {
        String id = null;
        do {
            id = inputWithOutEmpty(id != null ? "ID existed . Please input again:" : "Room / House ID");
        } while (villaService.findById(id));
        return id;
    }

    private static void add() {
        System.out.println("1. Room\n2. House\n");
        int choice = CommonUltility.getChoice(1, 2);
        String id = "";
        switch (choice) {
            case 1, 2:
                id = getIdWithoutExists();
                while (id.isEmpty()) {
                    System.out.printf("ID section cant be empty");
                }
                break;
        }
        Double area = inputToDouble("input the room's area!");
        Double price = inputToDouble("input the room's price!");
        int maxPeople = inputToInteger("input maximum of People");
        String contract = inputWithOutEmpty("type of contract");
        Villa villa = null;
        switch (choice) {
            case 1:
                String freeService = inputWithOutEmpty("type of FREE service");
                villa = new Room(id, area, price, maxPeople, contract, freeService);
                break;
            case 2:
                String standard = inputWithOutEmpty("type House's Standard");
                int numOfFloor = inputToInteger("how many floor does house have");
                villa = new House(id, area, price, maxPeople, contract, standard, numOfFloor);
                break;
        }
        villaService.create(villa);
        System.out.printf("Create Succesfully");
    }

    private static void search() {
        String id = inputWithOutEmpty("input the id to search");
        List<? extends Villa> villas = villaService.search(id);
        if (villas.size() == 0) {
            System.out.printf("there is no room or house ");
        } else {
            villas.forEach(e -> {
                if (e instanceof Room r) {
                    displayRoom(List.of(r));
                } else if (e instanceof House h) {
                    displayHouse(List.of(h));
                }
            });
        }
    }

    private static void delete() {
        boolean check = false;
        do {
            String id = inputWithOutEmpty(check ? "Enter id again" : "Enter id to delete");
            try {
                villaService.delete(id);
                System.out.println("Deleted successfully");
                check = false;
            } catch (NotFoundVillaID e) {
                System.out.println(e.getMessage());
                check = true;
            }
        } while (check);
    }
}
