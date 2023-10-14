package repository;

import exception.ParkingLotNotFoundException;
import models.ParkingFloor;
import models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Integer, ParkingLot> parkingLotMap;

    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
    }
    public ParkingLot get(int parkingLotId) throws ParkingLotNotFoundException {
        ParkingLot parkingLot = parkingLotMap.get(parkingLotId);
        if (parkingLot == null){
            throw  new ParkingLotNotFoundException("Parking Lot Not Found for Id: " + parkingLotId);
        } return parkingLot;
    }

    public ParkingLot put(ParkingLot parkingLot){
        parkingLotMap.put(parkingLot.getId(),parkingLot);
        return parkingLot;
    }
}
