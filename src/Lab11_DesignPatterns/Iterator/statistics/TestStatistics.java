package Lab11_DesignPatterns.Iterator.statistics;

import java.util.Random;

public class TestStatistics {
    private Statistics statistics;

    public TestStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public static void main(String[] args) {
//           Thực hiện từng hàm test.
        TestStatistics test;
        
        System.out.println("=== Test MyArrayList ===");
        MyArrayList arrayList = new MyArrayList();
        test = new TestStatistics(new Statistics(arrayList));
        test.testMyArrayList();
        
        System.out.println();
        System.out.println("=== Test MyLinkedList ===");
        MyLinkedList linkedList = new MyLinkedList();
        test = new TestStatistics(new Statistics(linkedList));
        test.testMyLinkedList();
    }

    public void testMyArrayList() {
        /* TODO
           - Sinh ngẫu nhiên một số tự nhiên nằm trong đoạn [30, 50], lưu vào biến length.
           - Tạo một list kiểu MyArrayList, có các phần tử dữ liệu kiểu double được sinh ngẫu nhiên
             nằm trong đoạn [1, 20]. Tạo Statistics có dữ liệu là list dữ liệu vừa tạo, lưu vào statistics.
           - Sử dụng Statistics để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai, rank, sắp xếp, tìm kiếm).
             In ra terminal tập dữ liệu, tập dữ liệu được sắp xếp, các đại lượng thống kê và kết quả chức năng tìm kiếm.
         */
        Random random = new Random();
        int length = random.nextInt(21) + 30;
        
        MyArrayList list = new MyArrayList();
        for (int i = 0; i < length; i++) {
            double value = 1 + random.nextDouble() * 19;
            list.add(value);
        }
        
        this.statistics = new Statistics(list);
        
        System.out.println("Tập dữ liệu gốc: " + list);
        
        MyArrayList sorted = list.sortIncreasing();
        System.out.println("Tập dữ liệu sắp xếp: " + sorted);
        
        System.out.println("Max: " + statistics.max());
        System.out.println("Min: " + statistics.min());
        System.out.println("Mean: " + statistics.mean());
        System.out.println("Variance: " + statistics.variance());
        
        double[] ranks = statistics.rank();
        System.out.print("Ranks: ");
        for (int i = 0; i < ranks.length; i++) {
            System.out.print(ranks[i]);
            if (i < ranks.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        double searchValue = list.iterator(0).next().doubleValue();
        int searchIndex = statistics.search(searchValue);
        System.out.println("Tìm kiếm giá trị " + searchValue + ": index = " + searchIndex);
    }

    public void testMyLinkedList() {
        /*
           - Sinh ngẫu nhiên một số tự nhiên nằm trong đoạn [30, 50], lưu vào biến length.
           - Tạo một list kiểu MyLinkedList, có các phần tử lưu dữ liệu kiểu double được sinh ngẫu nhiên
             nằm trong đoạn [1, 20]. Tạo Statistics có dữ liệu là list dữ liệu vừa tạo, lưu vào statistics.
           - Sử dụng Statistics để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai, rank, sắp xếp, tìm kiếm).
             In ra terminal tập dữ liệu, tập dữ liệu được sắp xếp, các đại lượng thống kê và kết quả chức năng tìm kiếm.
         */
        Random random = new Random();
        int length = random.nextInt(21) + 30;
        
        MyLinkedList list = new MyLinkedList();
        for (int i = 0; i < length; i++) {
            double value = 1 + random.nextDouble() * 19;
            list.add(value);
        }
        
        this.statistics = new Statistics(list);
        
        System.out.println("Tập dữ liệu gốc: " + list);
        
        MyLinkedList sorted = list.sortIncreasing();
        System.out.println("Tập dữ liệu sắp xếp: " + sorted);
        
        System.out.println("Max: " + statistics.max());
        System.out.println("Min: " + statistics.min());
        System.out.println("Mean: " + statistics.mean());
        System.out.println("Variance: " + statistics.variance());
        
        double[] ranks = statistics.rank();
        System.out.print("Ranks: ");
        for (int i = 0; i < ranks.length; i++) {
            System.out.print(ranks[i]);
            if (i < ranks.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        double searchValue = list.iterator(0).next().doubleValue();
        int searchIndex = statistics.search(searchValue);
        System.out.println("Tìm kiếm giá trị " + searchValue + ": index = " + searchIndex);
    }
}
