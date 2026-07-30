package Lab6_.statistics;

public class Statistics {
    private MyLinkedList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public Statistics(MyLinkedList data) {
        this.data = data;
    }

    /**
     * Hàm trả về giá trị lớn nhất trong list.
     * @return giá trị lớn nhất.
     */
    public double max() {
        double max = data.get(0);
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i) > max) {
                max = data.get(i);
            }
        }
        return max;
    }

    /**
     * Hàm trả về giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        double min = data.get(0);
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i) < min) {
                min = data.get(i);
            }
        }
        return min;
    }

    /**
     * Hàm trả về kỳ vọng của mẫu theo dữ liệu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += data.get(i);
        }
        return sum / data.size();
    }

    /**
     * Hàm trả về phương sai của mẫu theo dữ liệu trong list.
     * @return phương sai.
     */
    public double variance() {
        double mean = mean();
        double sumSquaredDiff = 0;
        for (int i = 0; i < data.size(); i++) {
            double diff = data.get(i) - mean;
            sumSquaredDiff += diff * diff;
        }
        return sumSquaredDiff / data.size();
    }

    /**
     * Tìm kiếm trong list có phẩn tử nào có giá trị bằng data không, sử dụng binarySearch trong list.
     * @return true nếu tìm thấy, false nếu không tìm thấy
     */
    public boolean search(double data) {
        return this.data.binarySearch(data);
    }

    /**
     * Hàm sắp xếp các giá trị trong list theo thứ tự tăng dần, sử dụng thuật toán sắp xếp trong MyLinkedList.
     * @return list mới được sắp xếp theo thuật toán insertion sort.
     */
    public MyLinkedList sort() {
        return data.sortIncreasingUsingInsertionSort();
    }

    /**
     * Tính rank của các phần tử trong list.
     * @return rank của các phần tử trong list
     */
    public double[] rank() {
        MyLinkedList sorted = sort();
        double[] ranks = new double[data.size()];
        for (int i = 0; i < data.size(); i++) {
            double value = data.get(i);
            int rank = 1;
            for (int j = 0; j < sorted.size(); j++) {
                if (sorted.get(j) < value) {
                    rank++;
                } else if (sorted.get(j) == value) {
                    break;
                }
            }
            ranks[i] = rank;
        }
        return ranks;
    }
}
