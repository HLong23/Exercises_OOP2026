package Lab12_DesignPatterns.AbstractFactory.B2;

public class ToyotaFactory implements VehicleFactory {

    @Override
    public Car createCar() {
        return new ToyotaCar();
    }

    @Override
    public Motorbike createMotorbike() {
        return new ToyotaMotorbike();
    }

}
