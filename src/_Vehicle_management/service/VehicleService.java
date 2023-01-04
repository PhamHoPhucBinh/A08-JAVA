package _Vehicle_management.service;

import java.util.List;

public interface VehicleService<E> {
    List<E> findAll();
    void create(E e);
    boolean findByID(String vehicleID);
    void delete(String vehicleID);
    List<E> search(String vehicleID);
}
