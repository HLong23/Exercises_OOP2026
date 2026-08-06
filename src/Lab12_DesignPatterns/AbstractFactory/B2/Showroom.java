package Lab12_DesignPatterns.AbstractFactory.B2;

public class Showroom {

    private VehicleFactory factory;

    public Showroom(VehicleFactory factory) {
        this.factory = factory;
    }

    public void displayVehicle() {

        Car car = factory.createCar();
        Motorbike motorbike = factory.createMotorbike();

        car.run();
        motorbike.run();
    }

}
