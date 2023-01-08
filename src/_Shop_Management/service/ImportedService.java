package _Shop_Management.service;

import _Shop_Management.model.Domestic;
import _Shop_Management.model.Imported;
import _Shop_Management.util.ReadWriteCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImportedService implements ProductService<Imported> {

    private final String IMPORTED_FILE = "D:\\A08\\A08-JAVA\\src\\_Shop_Management\\data\\IMPORTED_FILE.csv";

    public void displayImportedProduct() {
        // cần phải lấy dữ liệu và hiển thị ra
        List<Imported> importedList = ReadWriteCSV.readImportedProductFromCSV(IMPORTED_FILE);
        System.out.println("\n--------------Imported Product List---------------\n");
        System.out.println(String.format("%-15s%-20s%-10s%-15s%-10s", "ID", "Name", "Price", "Manufacturer", "Warranty"));
        for (Imported e : importedList) {
            System.out.println(String.format("%-15s%-20s%-10s%-15s%-10s", e.getProductID(), e.getProductName(), e.getPrice(), e.getManufacturer(), e.getCountry(),e.getProductStatus()));
        }
    }
    public static ArrayList<Imported> importedArrayList = new ArrayList<>();

    public List<Imported> findAll() {
        return importedArrayList;
    }

    public void create(Imported imported) {
        importedArrayList.add(imported);
    }

    public boolean findByID(String productID) {
        for (int i = 0; i < importedArrayList.size(); i++) {


            return importedArrayList.get(i).getProductID().equals(productID);
        }

        return false;
    }

    public void delete(String productID) {
        for (int i = 0; i < importedArrayList.size(); i++) {
            if (importedArrayList.get(i).getProductID().equals(productID)) {
                importedArrayList.remove(i);
                break;
            }
        }
    }

    public List<Imported> search(String productID) {
        return importedArrayList.stream().filter(e -> e.getProductID().contains(productID)).collect(Collectors.toList());
    }
}
