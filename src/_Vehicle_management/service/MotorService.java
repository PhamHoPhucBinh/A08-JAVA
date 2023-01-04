package _Vehicle_management.service;

import _Vehicle_management.model.Moto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MotorService implements VehicleService<Moto> {
    private ArrayList<Moto> motos = new ArrayList<>();

    public List<Moto> findAll() {
        return motos;
    }

    public void create(Moto moto) {
        motos.add(moto);
    }

    public boolean findByID(String vehicleID) {
        for (int i = 0; i < motos.size(); i++) {
//            if(trucks.get(i).getDriverPlate().equals(driverPlate)){
//                return true;
//            }

            return motos.get(i).getVehicleID().equals(vehicleID);
        }
        return false;
    }

    public void delete(String vehicleID) {
        for (int i = 0; i < motos.size(); i++) {
            if (motos.get(i).getVehicleID().equals(vehicleID)) {
                motos.remove(i);
                break;
            }
        }
    }

    public List<Moto> search(String vehicleID) {
        return motos.stream().filter(e -> e.getVehicleID().contains(vehicleID)).collect(Collectors.toList());
    }
}
