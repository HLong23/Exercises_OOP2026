package Lab6_.statistics;

public class MyLinkedList {
    private MyNode head;

    /*
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        this.head = null;
    }

    /*
     * Hàm trả về kịch thước của list.
     */
    public int size() {
        int count = 0;
        MyNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /*
     * Hàm trả về giá trị tại vị trí index trong list.
     */
    public double get(int index) {
        return getNodeByIndex(index).data;
    }


    /*
     * Hàm sửa giá trị ở vị trí index trong list.
     */
    public void set(double data, int index) {
        getNodeByIndex(index).data = data;
    }

    /*
     * Hàm thêm một phần tử vào list ở vị trí cuối list.
     */
    public void append(double data) {
        MyNode newNode = new MyNode(data);
        if (head == null) {
            head = newNode;
        } else {
            MyNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    /*
     * Hàm thêm một phần tử vào list ở vị trí index trong list.
     */
    public void insert(double data, int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = new MyNode(data, head);
        } else {
            MyNode current = getNodeByIndex(index - 1);
            current.next = new MyNode(data, current.next);
        }
    }

    /*
     * Hàm xóa phần tử trong list ở vị trí index.
     */
    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.next;
        } else {
            MyNode current = getNodeByIndex(index - 1);
            current.next = current.next.next;
        }
    }

    /*
     * Hàm sắp xếp list theo giá trị tăng dần sử dụng thuật toán insertion sort.
     */
    public MyLinkedList sortIncreasingUsingInsertionSort() {
        MyLinkedList sorted = new MyLinkedList();
        MyNode current = head;
        while (current != null) {
            double data = current.data;
            if (sorted.head == null || data < sorted.head.data) {
                sorted.head = new MyNode(data, sorted.head);
            } else {
                MyNode sortedCurrent = sorted.head;
                while (sortedCurrent.next != null && sortedCurrent.next.data <= data) {
                    sortedCurrent = sortedCurrent.next;
                }
                sortedCurrent.next = new MyNode(data, sortedCurrent.next);
            }
            current = current.next;
        }
        return sorted;
    }

    /*
     * Hàm tìm kiếm một phần tử data trong list sử dụng thuật toán binary search.
     */
    public boolean binarySearch(double data) {
        int left = 0;
        int right = size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            double midValue = get(mid);
            if (midValue == data) {
                return true;
            } else if (midValue < data) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    /*
     * Hàm trả về node ở vị trí index.
     */
    private MyNode getNodeByIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        MyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    /*
     * Hàm định dạng list.
     * @return xâu ký tự biểu diễn list theo định dạng [a1, a2, ..., an]
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        MyNode current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
