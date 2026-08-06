package Lab12_DesignPatterns.BuilderPattern.B1;

public class CarBuilder implements Builder {

    private Car car;

    public CarBuilder() {
        reset();
    }

    @Override
    public Builder reset() {
        car = new Car();
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        car.setSeats(seats);
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripComputer(boolean hasTripComputer) {
        car.setTripComputer(hasTripComputer);
        return this;
    }

    @Override
    public Builder setGPS(boolean hasGPS) {
        car.setGPS(hasGPS);
        return this;
    }

    public Car getResult() {
        return car;
    }
}
