package Lab12_DesignPatterns.BuilderPattern.B1;

public class CarManualBuilder implements Builder {

    private Manual manual;

    public CarManualBuilder() {
        reset();
    }

    @Override
    public Builder reset() {
        manual = new Manual();
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        manual.setSeats(seats);
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        manual.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripComputer(boolean hasTripComputer) {
        manual.setTripComputer(hasTripComputer);
        return this;
    }

    @Override
    public Builder setGPS(boolean hasGPS) {
        manual.setGPS(hasGPS);
        return this;
    }

    public Manual getResult() {
        return manual;
    }
}
