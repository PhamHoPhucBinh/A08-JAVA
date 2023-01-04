package _Vehicle_management.service;

import _Vehicle_management.model.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TruckService implements VehicleService<Truck> {
    private ArrayList<Truck> trucks = new ArrayList<>();

    public List<Truck> findAll(){
        return trucks;
    }

    public void create (Truck truck){
        trucks.add(truck);
    }

    public boolean findByID(String vehicleID){
        for (int i = 0; i < trucks.size(); i++) {
//            if(trucks.get(i).getDriverPlate().equals(driverPlate)){
//                return true;
//            }

            return trucks.get(i).getVehicleID().equals(vehicleID);
        }

        return false;
    }

    public void delete(String vehicleID){
        for (int i = 0; i < trucks.size(); i++) {
            if(trucks.get(i).getVehicleID().equals(vehicleID)){
                trucks.remove(i);
                break;
            }
        }
    }

    public List<Truck> search(String vehicleID){
        return trucks.stream().filter(e -> e.getVehicleID().contains(vehicleID)).collect(Collectors.toList());
    }
}
