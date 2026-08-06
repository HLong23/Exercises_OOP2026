package Lab12_DesignPatterns.BuilderPattern.B1;

public interface Builder {

    Builder reset();

    Builder setSeats(int seats);

    Builder setEngine(Engine engine);

    Builder setTripComputer(boolean hasTripComputer);

    Builder setGPS(boolean hasGPS);

}
