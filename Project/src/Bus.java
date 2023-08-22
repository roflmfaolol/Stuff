import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bus {
    private LocalDate productionDate;
    private boolean availability;
    private int seatQuantity;
    private String brand;
    private String model;
    private String vin;
    private int mileage;
    private String technicalCondition;

    private List<Trip> trips = new ArrayList<>();

    public Bus(String model) {
        this.model = model;
    }

    public void addTrip(Trip newTrip) {
        if(!trips.contains(newTrip)) {
            trips.add(newTrip);

            newTrip.setBus(this);
        }
    }
    public void removeTrip(Trip trip) {
        if(trips.contains(trip)) {
            trips.remove(trip);
            trip.removeBus();
        }
    }
    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getSeatQuantity() {
        return seatQuantity;
    }

    public void setSeatQuantity(int seatQuantity) {
        this.seatQuantity = seatQuantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getTechnicalCondition() {
        return technicalCondition;
    }

    public void setTechnicalCondition(String technicalCondition) {
        this.technicalCondition = technicalCondition;
    }
}
