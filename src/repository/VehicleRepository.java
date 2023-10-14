package repository;

import exception.VehicleNotFoundException;
import models.Vehicle;

import javax.swing.plaf.PanelUI;
import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    private Map<Integer, Vehicle> vehicleMap;

    public VehicleRepository() {
        this.vehicleMap = new HashMap<>();
    }

    public Vehicle get(int vehicleId) throws VehicleNotFoundException {
        Vehicle vehicle = vehicleMap.get(vehicleId);
        if (vehicle == null){
            throw new VehicleNotFoundException("Vehicle not found for te id: " + vehicleId);
        }return vehicle;
    }
    public Vehicle put(Vehicle vehicle){
        vehicleMap.put(vehicle.getId(),vehicle);
        return vehicle;
    }
}
