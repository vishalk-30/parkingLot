package models;

import models.constant.ParkingLotStatus;
import models.constant.VehicleType;
import service.strategy.BillCalculationStrategy.BillCalculationStrategy;
import service.strategy.seatAllocationStrategy.SeatAllocationStrategy;

import java.util.List;

public class ParkingLot {
    private String name;
    private String address;
    private List<ParkingFloor> parkingFloors;
    private ParkingLotStatus parkingLotStatus;
    private List<VehicleType> vehicleTypes;
    private SeatAllocationStrategy seatAllocationStrategy;
    private BillCalculationStrategy billCalculationStrategy;
}
