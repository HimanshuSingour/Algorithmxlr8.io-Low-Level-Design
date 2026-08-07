public class Main {

    public static void main(String[] args) {

        ParkingLot lot = new ParkingLot();

        lot.addSpot(new ParkingSpot("B1", VehicleType.BIKE));
        lot.addSpot(new ParkingSpot("C1", VehicleType.CAR));
        lot.addSpot(new ParkingSpot("C2", VehicleType.CAR));
        lot.addSpot(new ParkingSpot("BUS1", VehicleType.BUS));

        lot.display();

        Vehicle bike = new Vehicle("MH12AB1234", VehicleType.BIKE);

        Ticket ticket = lot.park(bike);

        lot.display();

        lot.leave(ticket);

        lot.display();
    }
}