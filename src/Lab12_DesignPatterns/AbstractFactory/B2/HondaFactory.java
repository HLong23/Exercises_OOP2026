package Lab12_DesignPatterns.AbstractFactory.B2;

public class HondaFactory implements VehicleFactory {

    @Override
    public Car createCar() {
        return new HondaCar();
    }

    @Override
    public Motorbike createMotorbike() {
        return new HondaMotorbike();
    }

}
