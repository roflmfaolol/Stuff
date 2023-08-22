import java.time.LocalDateTime;

public class Trip {
    private LocalDateTime duration;
    private Bus bus;

    public Trip(LocalDateTime duration) {
        this.duration = duration;
    }

    public void setBus(Bus newBus) {
        if(bus != null) {
            bus.removeTrip(this);
        }
        else if(bus==null ? newBus!=null : newBus.equals(bus)) {
            bus = newBus;

            newBus.addTrip(this);
        }
    }
    public void removeBus() {
        if(bus != null) {
            bus.removeTrip(this);
            bus = null;
        }
    }
    public LocalDateTime getDuration() {
        return duration;
    }
    public void setDuration(LocalDateTime duration) {
        this.duration = duration;
    }
}
