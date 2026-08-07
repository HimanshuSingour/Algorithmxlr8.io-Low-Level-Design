import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<ParkingSpot> spots = new ArrayList<>();

    public void addSpot(ParkingSpot spot) {
        spots.add(spot);
    }

    public Ticket park(Vehicle vehicle) {

        for (ParkingSpot spot : spots) {

            if (spot.canFit(vehicle)) {
                spot.park();
                System.out.println("Parked at : " + spot.getId());
                return new Ticket(vehicle, spot);
            }
        }

        System.out.println("No Spot Available");
        return null;
    }

    public void leave(Ticket ticket) {

        ticket.getSpot().leave();

        long hours =
                (System.currentTimeMillis() - ticket.getEntryTime())
                        / (1000 * 60 * 60);

        if (hours == 0)
            hours = 1;

        int price = 0;

        switch (ticket.getVehicle().getType()) {

            case BIKE:
                price = (int) hours * 20;
                break;

            case CAR:
                price = (int) hours * 50;
                break;

            case BUS:
                price = (int) hours * 100;
                break;
        }

        System.out.println("Fee = ₹" + price);
    }

    public void display() {

        int free = 0;

        for (ParkingSpot spot : spots) {
            if (!spot.isOccupied())
                free++;
        }

        System.out.println("Free Spots : " + free + "/" + spots.size());
    }
}