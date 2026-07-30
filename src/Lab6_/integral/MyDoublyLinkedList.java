package Lab6_.integral;

public class MyDoublyLinkedList {
    private MyNode head;
    private int size;

    /*
     * Khởi tạo dữ liệu mặc định.
     */
    public MyDoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    /*
     * Hàm trả về kịch thước của list.
     */
    public int size() {
        return this.size;
    }

    /*
     * Hàm trả về giá trị tại vị trí index trong list.
     */
    public double get(int index) {
        return getNodeByIndex(index).data;
    }

    /*
     * Hàm trả về một mảng là các giá trị được lưu trong list.
     */
    public double[] toArray() {
        double[] result = new double[size];
        MyNode current = head;
        for (int i = 0; i < size; i++) {
            result[i] = current.data;
            current = current.next;
        }
        return result;
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
            newNode.previous = current;
        }
        size++;
    }

    /*
     * Hàm thêm một phần tử vào list ở vị trí index trong list.
     */
    public void insert(double data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            MyNode newNode = new MyNode(data, null, head);
            if (head != null) {
                head.previous = newNode;
            }
            head = newNode;
        } else if (index == size) {
            append(data);
            return;
        } else {
            MyNode current = getNodeByIndex(index);
            MyNode newNode = new MyNode(data, current.previous, current);
            current.previous.next = newNode;
            current.previous = newNode;
        }
        size++;
    }

    /*
     * Hàm xóa phần tử trong list ở vị trí index.
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.previous = null;
            }
        } else {
            MyNode current = getNodeByIndex(index);
            current.previous.next = current.next;
            if (current.next != null) {
                current.next.previous = current.previous;
            }
        }
        size--;
    }

    /*
     * Hàm trả về node ở vị trí index.
     */
    private MyNode getNodeByIndex(int index) {
        if (index < 0 || index >= size) {
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
     * @return xâu ký tự biểu diễn list theo định dạng (a1, a2, ..., an)
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        MyNode current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append(")");
        return sb.toString();
    }
}
