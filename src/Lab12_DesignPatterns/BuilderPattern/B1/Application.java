package Lab12_DesignPatterns.BuilderPattern.B1;

public class Application {

    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println(car);

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);

        Manual manual = manualBuilder.getResult();
        System.out.println(manual);

        System.out.println();

        director.constructSUV(carBuilder);
        System.out.println(carBuilder.getResult());

        director.constructSUV(manualBuilder);
        System.out.println(manualBuilder.getResult());
    }
}
