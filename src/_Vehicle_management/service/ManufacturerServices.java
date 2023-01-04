package _Vehicle_management.service;

import _Vehicle_management.model.Manufacturer;

import java.util.ArrayList;
import java.util.List;

public class ManufacturerServices {
    private ArrayList<Manufacturer> manufacturerList = new ArrayList<>();

    public ManufacturerServices() {
        manufacturerList.add(new Manufacturer("HD", "Honda", "Japan"));
        manufacturerList.add(new Manufacturer("PE", "Peugoet", "France"));
        manufacturerList.add(new Manufacturer("HU", "Huyndai", "Korea"));
        manufacturerList.add(new Manufacturer("FO", "Ford", "USA"));
    }

    public List<Manufacturer> findAll() {
        return manufacturerList;
    }

    public Manufacturer findByName(String name) {
        for (int i = 0; i < manufacturerList.size(); i++) {
            if (manufacturerList.get(i).getName().equals(name)) {
                return manufacturerList.get(i);
            }
        }
        return null;
    }
}
