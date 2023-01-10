package vehicle_manager.VehicleManager_p1_collection.src.service;

import java.util.List;

public interface VehicleService<E> {
    List<E> findAll();
    void create(E e);
    boolean findByDriverPlate(String driverPlate);
    void delete(String driverPlate);
    List<E> search(String driverPlate);
}
