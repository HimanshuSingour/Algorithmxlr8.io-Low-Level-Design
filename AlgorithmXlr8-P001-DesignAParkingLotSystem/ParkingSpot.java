public class ParkingSpot {

    private String id;
    private VehicleType spotType;
    private boolean occupied;

    public ParkingSpot(String id, VehicleType spotType) {
        this.id = id;
        this.spotType = spotType;
    }

    public boolean canFit(Vehicle vehicle) {

        if (occupied)
            return false;

        if (vehicle.getType() == VehicleType.BIKE)
            return spotType == VehicleType.BIKE || spotType == VehicleType.CAR;

        return vehicle.getType() == spotType;
    }

    public void park() {
        occupied = true;
    }

    public void leave() {
        occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public String getId() {
        return id;
    }
}