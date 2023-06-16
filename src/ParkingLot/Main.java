package ParkingLot;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }
}

class ParkingLot {
    List<ParkingFloor> parkingFloorList;
    List<EntryGate> entryGateList;
    List <ExitGate> exitGateList;
    String parkingLotName;
    Address address;
    public boolean isSpaceAvailable(Vehicle vehicle){}
    public ParkingSpace getParkingSpace() {
    }
    public boolean updateParkingAttendant(ParkingAttendant parkingAttendant, int gateId){}
}
class Address {

    String country;
    String state;
    String city;
    String street;
    String pinCode; //ZipCode
}

class ParkingFloor {
    int levelId;
    boolean isFull;
    List<ParkingSpace> parkingSpaceList;
    ParkingDisplayBoard parkingDisplayBoard;
}

class Gate {
    int gateId;
    ParkingAttendant parkingAttendant;
}

class EntryGate extends Gate {
    public ParkingTicket getParkingTicket(Vehicle vehicle){};
}
class ExitGate extends Gate {
    public ParkingTicket getPayment(ParkingTicket parkingTicket, PaymentType paymentType){}
}
class ParkingSpace {
    int spaceId;
    boolean isFree;
    double costPerHour;
    Vehicle vehicle;
    SpaceType spaceType;

    public boolean assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        isFree = false;
        return true;
    }
    public boolean removeVehicle() {}
}
enum SpaceType{
    TWO_WHEELER, FOUR_WHEELER
}
enum VehicleType {
    BIKE, CAR
}
class ParkingDisplayBoard {
    Map<SpaceType, Integer> freeSpotAvailable;
    public void updateFreeSpotAvailable(SpaceType spaceType, int space) {
    }
}
class Account {
    String name;
    String email;
    String password;
}
class Admin extends Account {
    public void addParkingFloor(ParkingLot parkingLot, ParkingFloor floor){}
    public void addParkingSpace(ParkingFloor parkingFloor, ParkingSpace parkingSpace) {}
    public void addParkingDisplayBoard(ParkingFloor parkingFloor, ParkingDisplayBoard parkingDisplayBoard){}
}
class ParkingAttendant extends Account {
    Payment paymentService;
    public boolean processVehicleEntry(Vehicle vehicle){}
    public PaymentInfo processPayment(ParkingTicket parkingTicket, PaymentType paymentType){}
}
abstract class Vehicle {
    String licenseNumber;
    ParkingTicket parkingTicket;
    VehicleType vehicleType;
}
class Car extends Vehicle {

}

class ParkingTicket {

    int ticketId;
    int levelId;
    int spaceId;
    Date vehicleEntryDateTime;
    Date vehicleExitDateTime;
    SpaceType parkingSpaceType;
    double totalCost;
    ParkingTicketStatus parkingTicketStatus;
    public void updateTotalCost(){};
    public void updateVehicleExitTime(Date vehicleExitDateTime){};

}

class Payment {
    public PaymentInfo makePayment(ParkingTicket parkingTicket, PaymentType paymentType) {}
}

class PaymentInfo {
    double amount;
    Date paymentDate;
    int transactionId;
    ParkingTicket parkingTicket;
    PaymentStatus paymentStatus;
}
enum PaymentType {
    UPI, CREDIT_CARD, CASH;
}
enum PaymentStatus {
    COMPLETED, STARTED, IN_PROGRESS;
}
enum ParkingTicketStatus {
    PAID, ACTIVE;
}



