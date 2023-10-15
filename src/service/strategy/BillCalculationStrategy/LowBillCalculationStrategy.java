package service.strategy.BillCalculationStrategy;

import models.Ticket;
import models.constant.VehicleType;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LowBillCalculationStrategy implements BillCalculationStrategy{

    private static final  int PER_HOUR_CHARGE_2WHEELER = 50;
    private static final  int PER_HOUR_CHARGE_4WHEELER = 100;
    private static final  double INCREMENT_FACTOR = 0.1;

    /*
        formula --
        baseCost = fixed_cost*total_hour
        totalCost = baseCost + baseCost*INCREMENT_FACTOR*(total_hour-1)
     */

    @Override
    public double calculateBillAmount(Ticket ticket, LocalDateTime exitTime) {
        LocalDateTime entryTime = ticket.getEntryTime();
        int totalHours = (int) ChronoUnit.HOURS.between(entryTime,exitTime);
        double baseCost = cost(ticket.getVehicle().getVehicleType(),totalHours);
        return baseCost + baseCost*(INCREMENT_FACTOR)*(totalHours-1);
    }
    public double cost(VehicleType vehicleType,int time){
        int costPerHour = 0;

        switch(vehicleType){
            case BIKE -> {
                costPerHour = PER_HOUR_CHARGE_2WHEELER;
            }
            case CAR, BUS,TRUCK-> {
                costPerHour = PER_HOUR_CHARGE_4WHEELER;
            }
        } return costPerHour*time;
    }
}
