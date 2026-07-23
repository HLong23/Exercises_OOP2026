package Lab8_.rootsolver;

public class MyLinkedList {
    private MyNode top;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        this.top = null;
    }

    /**
     * Lấy kích thước danh sách
     * @return
     */
    public int size() {
        int count = 0;
        MyNode current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /**
     * Lấy giá trị của node ở vị trí index
     * @return
     */
    public double get(int index) {
        MyNode node = getNodeByIndex(index);
        if (node == null) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return node.data;
    }

    /**
     * Thay đổi giá trị của node ở vị trí index
     */
    public void set(double data, int index) {
        MyNode node = getNodeByIndex(index);
        if (node == null) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        node.data = data;
    }

    /**
     * Thêm node có giá trị data tại vị trí cuối danh sách
     * @param data
     */
    public void add(double data) {
        MyNode newNode = new MyNode(data);
        if (top == null) {
            top = newNode;
        } else {
            MyNode current = top;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.previous = current;
        }
    }

    /**
     * Thêm node có giá trị data tại vị trí index
     * @param data
     * @param index
     */
    public void insert(double data, int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        if (index == 0) {
            MyNode newNode = new MyNode(data);
            newNode.next = top;
            if (top != null) {
                top.previous = newNode;
            }
            top = newNode;
        } else if (index == size()) {
            add(data);
        } else {
            MyNode current = getNodeByIndex(index);
            MyNode newNode = new MyNode(data, current, current.previous);
            current.previous.next = newNode;
            current.previous = newNode;
        }
    }

    /**
     * Xóa node tại vị trí index
     * @param index
     */
    public void remove(int index) {
        MyNode node = getNodeByIndex(index);
        if (node == null) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        if (node.previous != null) {
            node.previous.next = node.next;
        } else {
            top = node.next;
        }
        if (node.next != null) {
            node.next.previous = node.previous;
        }
    }

    /**
     * Lấy node ở vị trí index.
     * @param index
     * @return
     */
    private MyNode getNodeByIndex(int index) {
        if (index < 0) {
            return null;
        }
        MyNode current = top;
        int count = 0;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
        return current;
    }
}
