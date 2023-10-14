package repository;


import exception.ParkingSlotNotFoundException;
import models.ParkingSlot;
import java.util.HashMap;
import java.util.Map;

public class ParkingSlotRepository {
    private Map<Integer, ParkingSlot> parkingSlotMap;


    public ParkingSlotRepository() {
        this.parkingSlotMap = new HashMap<>();
    }

    public ParkingSlot get(int parkingSlotId) throws ParkingSlotNotFoundException {
        ParkingSlot parkingSlot = parkingSlotMap.get(parkingSlotId);
        if(parkingSlot == null){
            throw new ParkingSlotNotFoundException("Parking Slot Not found for Id: " + parkingSlotId);
        } return parkingSlot;
    }

    public ParkingSlot put(ParkingSlot gate){
        parkingSlotMap.put(gate.getId(),gate);
        return gate;

    }
}
