package Lab8_.algorithm;

public class IterativeBinarySearch implements Searcher {
    private Sorter sorter;

    public IterativeBinarySearch() {
        this.sorter = new BubbleSort();
    }

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    @Override
    public int search(double value, double[] data) {
        double[] sortedData = data.clone();
        sorter.sort(sortedData, true);
        return iterativeBinarySearch(value, sortedData);
    }

    /**
     * Tìm kiếm giá trị value trong mảng data, sử dụng thuật toán tìm kiếm nhị phân code theo thuật toán lặp.
     * @param data
     * @param value
     * @return
     */
    private int iterativeBinarySearch(double value, double[] data) {
        int left = 0;
        int right = data.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (Math.abs(data[mid] - value) < 1e-9) {
                return mid;
            }
            
            if (data[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}
