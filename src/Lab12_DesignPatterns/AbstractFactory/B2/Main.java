package Lab12_DesignPatterns.AbstractFactory.B2;

/*
Mô phỏng một showroom bán xe sử dụng Abstract Factory Pattern

Car, Motorbike:	Abstract Product – định nghĩa giao diện chung cho từng loại sản phẩm.
ToyotaCar, HondaCar, ToyotaMotorbike, HondaMotorbike:	Concrete Product – cài đặt cụ thể cho từng thương hiệu.
VehicleFactory:	Abstract Factory – khai báo các phương thức tạo sản phẩm.
ToyotaFactory, HondaFactory:	Concrete Factory – tạo các sản phẩm cùng một họ (cùng thương hiệu).
Showroom:	Client – sử dụng Factory để lấy sản phẩm mà không cần biết lớp cụ thể.
Main:	Khởi tạo Factory phù hợp và truyền cho Client.
 */


public class Main {
    public static void main(String[] args) {

        VehicleFactory factory;

        String brand = "Toyota";

        if (brand.equalsIgnoreCase("Toyota")) {
            factory = new ToyotaFactory();
        } else {
            factory = new HondaFactory();
        }

        Showroom showroom = new Showroom(factory);
        showroom.displayVehicle();

    }

}
