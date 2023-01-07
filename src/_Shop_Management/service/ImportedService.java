package _Shop_Management.service;

import _Shop_Management.model.Imported;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImportedService implements ProductService<Imported> {
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
