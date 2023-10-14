package service.strategy.seatAllocationStrategy;

import models.Gate;
import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSlot;
import models.constant.VehicleType;

public interface SeatAllocationStrategy {
    ParkingSlot findParkingSlot(VehicleType vehicleType, ParkingLot parkingLot, Gate entryGate);
}
