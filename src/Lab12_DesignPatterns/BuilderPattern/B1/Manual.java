package Lab12_DesignPatterns.BuilderPattern.B1;

public class Manual {

    private int seats;
    private Engine engine;
    private boolean tripComputer;
    private boolean gps;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPS(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {

        return "Manual{" +
                "seats=" + seats +
                ", engine=" + engine.getType() +
                ", tripComputer=" + tripComputer +
                ", gps=" + gps +
                '}';
    }

}
