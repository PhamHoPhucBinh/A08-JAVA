package _Vehicle_management.service;

import _Vehicle_management.model.Car;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
public class CarService implements VehicleService<Car> {
    private ArrayList<Car> cars = new ArrayList<>();

    public List<Car> findAll(){
        return cars;
    }

    public void create(Car car){
        cars.add(car);
    }

    public boolean findByID(String vehicleID){
        for (int i = 0; i < cars.size(); i++) {


            return cars.get(i).getVehicleID().equals(vehicleID);
        }

        return false;
    }

    public void delete(String vehicleID){
        for (int i = 0; i < cars.size(); i++) {
            if(cars.get(i).getVehicleID().equals(vehicleID)){
                cars.remove(i);
                break;
            }
        }
    }

    public List<Car> search(String vehicleID){
        return cars.stream().filter(e -> e.getVehicleID().contains(vehicleID)).collect(Collectors.toList());
    }
}


