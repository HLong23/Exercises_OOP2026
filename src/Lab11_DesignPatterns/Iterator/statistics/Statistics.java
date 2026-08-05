package Lab11_DesignPatterns.Iterator.statistics;

public class Statistics {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public Statistics(MyList data) {
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * @return giá trị lớn nhất.
     */
    public double max() {
        MyIterator iterator = data.iterator(0);
        double max = Double.MIN_VALUE;
        while (iterator.hasNext()) {
            double value = iterator.next().doubleValue();
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        MyIterator iterator = data.iterator(0);
        double min = Double.MAX_VALUE;
        while (iterator.hasNext()) {
            double value = iterator.next().doubleValue();
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    /**
     * Tính kỳ vọng của mẫu theo dữ liệu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        MyIterator iterator = data.iterator(0);
        double sum = 0;
        int count = 0;
        while (iterator.hasNext()) {
            sum += iterator.next().doubleValue();
            count++;
        }
        return sum / count;
    }

    /**
     * Tính phương sai của mẫu theo dữ liệu trong list.
     * @return phương sai.
     */
    public double variance() {
        double mean = mean();
        MyIterator iterator = data.iterator(0);
        double sumSquaredDiff = 0;
        int count = 0;
        while (iterator.hasNext()) {
            double value = iterator.next().doubleValue();
            sumSquaredDiff += Math.pow(value - mean, 2);
            count++;
        }
        return sumSquaredDiff / count;
    }

    /**
     * Tìm kiếm trong list có phẩn tử nào có giá trị bằng data không, sử dụng binarySearch trong list.
     * Trả về index một phần tử có giá trị bằng data, nếu không tìm thấy thì trả về -1.
     * @return
     */
    public int search(double data) {
        return this.data.binarySearch(data);
    }

    /**
     * Tính rank của các phần tử trong list.
     * @return rank của các phần tử trong list
     */
    public double[] rank() {
        MyList sorted = data.sortIncreasing();
        int n = data.size();
        double[] ranks = new double[n];
        
        for (int i = 0; i < n; i++) {
            MyIterator originalIterator = data.iterator(0);
            double value = 0;
            int index = 0;
            while (originalIterator.hasNext()) {
                if (index == i) {
                    value = originalIterator.next().doubleValue();
                    break;
                }
                originalIterator.next();
                index++;
            }
            
            MyIterator sortedIterator = sorted.iterator(0);
            int rank = 1;
            while (sortedIterator.hasNext()) {
                if (sortedIterator.next().doubleValue() == value) {
                    ranks[i] = rank;
                    break;
                }
                rank++;
            }
        }
        return ranks;
    }
}
