package _Shop_Management.service;

import _Shop_Management.model.Domestic;
import _Shop_Management.util.ReadWriteCSV;
import _Vehicle_management.model.Moto;
import ss9_mvc.model.Student;
import ss9_mvc.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DomesticService implements ProductService<Domestic> {

    private final String DOMESTIC_FILE = "src\\_Shop_Management\\data\\DOMESTIC_FILE.csv";

    public void displayDomesticProduct() {
        // cần phải lấy dữ liệu và hiển thị ra
        List<Domestic> domesticList = ReadWriteCSV.readDomesticProductFromCSV(DOMESTIC_FILE);
        System.out.println("\n--------------Domestic Product List---------------\n");
        System.out.println(String.format("%-15s%-20s%-10s%-15s%-10s", "ID", "Name", "Price", "Manufacturer", "Warranty"));
        for (Domestic e : domesticList) {
                    System.out.println(String.format("%-15s%-20s%-10s%-15s%-10s", e.getProductID(), e.getProductName(), e.getPrice(), e.getManufacturer(), e.getWarrantyPeriod()));
                }
    }

    public static ArrayList<Domestic> domesticArrayList = new ArrayList<>();

    public List<Domestic> findAll() {
        return domesticArrayList;
    }

    public void create(Domestic domestic) {
        domesticArrayList.add(domestic);

    }

    public boolean findByID(String productID) {
        for (int i = 0; i < domesticArrayList.size(); i++) {

            return domesticArrayList.get(i).getProductID().equals(productID);
        }
        return false;
    }

    public void delete(String productID) {
        for (int i = 0; i < domesticArrayList.size(); i++) {
            if (domesticArrayList.get(i).getProductID().equals(productID)) {
                domesticArrayList.remove(i);
                break;
            }
        }
    }

    public List<Domestic> search(String productID) {
        return domesticArrayList.stream().filter(e -> e.getProductID().contains(productID)).collect(Collectors.toList());
    }
}
