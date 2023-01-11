package _Resort_Management.service;

import _Resort_Management.Exception.NotFoundVillaID;
import _Resort_Management.Ultility.ConstantUltilities;
import _Resort_Management.Ultility.FileHelper;
import _Resort_Management.model.House;
import _Resort_Management.model.Room;
import _Resort_Management.model.Villa;
import util.ConstantUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class VillaService {
    private List<Room> rooms;
    private List<House> houses;

    private FileHelper<Room> fileRoom = new FileHelper<>();
    private FileHelper<House> fileHouse = new FileHelper<>();

    public VillaService() {
        rooms = toRooms();
        houses = toHouses();
    }

    public List<Room> getAllRoom() {
        return rooms;
    }

    public List<House> getAllMotor() {
        return houses;
    }

    public void create(Villa villa) {
        if (villa instanceof Room r) {
            rooms.add(r);
            fileRoom.write(ConstantUltilities.FilePath.Room, rooms, false);
        } else if (villa instanceof House h) {
            houses.add(h);
            fileHouse.write(ConstantUltilities.FilePath.House, houses, false);
        }
    }
    //FIND
    public boolean findById(String id) {
        return Stream.of(rooms,houses).flatMap(Collection::stream).anyMatch(e -> e.getId().equals(id));
    }

    //DELETE
    public boolean delete(String id) throws NotFoundVillaID {
        if (rooms.removeIf(e -> e.getId().equals(id))) {
            fileRoom.write(ConstantUltilities.FilePath.Room, rooms, false);
            return true;
        }

        if (houses.removeIf(e -> e.getId().equals(id))) {
            fileHouse.write(ConstantUltilities.FilePath.House, houses, false);
            return true;
        }

        throw new NotFoundVillaID("this ID is not existed");
    }

    public List<? extends Villa> search(String id) {
        return Stream.of(rooms, houses).flatMap(Collection::stream).filter(e -> e.getId().contains(id)).toList();
    }

    private List<House> toHouses() {
        List<House> res = new ArrayList<>();
        List<String> lines = fileHouse.read(ConstantUltilities.FilePath.House);

        for (String line : lines) {
            String[] tmp = line.split(",");
            String id = tmp[0];
            Double area = tmp[1];
            Double price = tmp[2];
            String owner = tmp[3];
            int numberSeat = Integer.parseInt(tmp[4]);
            String typeCar = tmp[5];
           House house = new House();
            res.add(car);
        }

        return res;
    }
}
