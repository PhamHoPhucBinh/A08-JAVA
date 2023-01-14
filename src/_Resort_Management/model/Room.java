package _Resort_Management.model;

public class Room extends Villa {
    String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, Double area, Double price, int maxPeople, String contract, String freeService) {
        super(id, area, price, maxPeople, contract);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return String.format("%s,%s",super.toString(),freeService) ;
    }
}
