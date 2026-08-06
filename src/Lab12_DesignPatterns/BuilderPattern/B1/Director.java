package Lab12_DesignPatterns.BuilderPattern.B1;

public class Director {

    public void constructSportsCar(Builder builder) {

        builder.reset()
                .setSeats(2)
                .setEngine(new Engine("Sport Engine"))
                .setTripComputer(true)
                .setGPS(true);
    }

    public void constructSUV(Builder builder) {

        builder.reset()
                .setSeats(7)
                .setEngine(new Engine("SUV Engine"))
                .setTripComputer(true)
                .setGPS(true);
    }
}
