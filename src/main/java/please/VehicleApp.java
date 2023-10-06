package please;

import interfaces.Driveable;
import interfaces.Flyable;

import java.util.*;

public class VehicleApp {
    public static void printListOfVehicleNames(List<Vehicle> vehicleList){
        System.out.println("Vehicles: ");
       for (Vehicle vehicle : vehicleList) {
           System.out.println(vehicle.getClass().getName());
       }
    }

    public static void printListOfFlyableObjects(List<Flyable> flyableList){
        System.out.println("Flyable: ");
        for (Flyable flyable : flyableList) {
            System.out.println(flyable.getClass().getSimpleName());
        }
    }
    public static void sortAndPrintDrivableVehiclesBuSpeed(List<Driveable> driveableList){

        for (Driveable driveable : driveableList ){

        }
    }
    public static void printPassengerNumbersOnly(Map<Integer, String > passengerMap){
        System.out.println("Passenger Number: ");
        for (Integer passengerNumber : passengerMap.keySet()){
            System.out.println(passengerNumber);
        }

    }
}
