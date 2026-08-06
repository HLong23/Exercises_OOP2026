package Lab12_DesignPatterns.BuilderPattern.B2;

/*
Mô phỏng quá trình cấu hình một máy tính bằng Builder Pattern

- Computer: Là lớp sản phẩm (Product) được tạo bởi Builder. Lớp này chứa các thông tin của một máy tính.
Đối tượng Computer chỉ có thể được tạo thông qua lớp Builder
- Builder: Là lớp chịu trách nhiệm xây dựng đối tượng Computer. Builder chứa các thuộc tính giống với
lớp Computer và cung cấp các phương thức, mỗi phương thức trả về chính đối tượng Builder
Sau khi thiết lập xong tất cả thuộc tính, phương thức build() sẽ tạo đối tượng Computer, gán các giá trị
từ Builder sang đối tượng mới và trả về cho chương trình.
- Main: Lớp đóng vai trò là Client. Client không tạo trực tiếp đối tượng bằng constructor
mà sử dụng Builder để tạo các cấu hình máy tính khác nhau. Mỗi đối tượng có cấu hình riêng nhưng đều
được tạo theo cùng một quy trình của Builder Pattern
 */

public class Main {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .withCPU("Intel Core i9")
                .withRAM("32GB DDR5")
                .withStorage("1TB SSD")
                .withGPU("NVIDIA RTX 5080")
                .withWifi(true)
                .build();

        Computer officePC = new Computer.Builder()
                .withCPU("Intel Core i5")
                .withRAM("16GB DDR4")
                .withStorage("512GB SSD")
                .withGPU("Integrated Graphics")
                .withWifi(true)
                .build();

        System.out.println("Gaming PC");
        System.out.println(gamingPC);

        System.out.println();

        System.out.println("Office PC");
        System.out.println(officePC);

    }

}
