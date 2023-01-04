package _Shop_Management.service;

import _Shop_Management.model.Domestic;
import _Vehicle_management.model.Moto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DomesticService implements ProductService<Domestic> {
    private ArrayList<Domestic> domesticArrayList = new ArrayList<>();
    public List<Domestic> findAll(){
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
