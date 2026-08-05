package Lab11_DesignPatterns.Iterator.statistics;

public class MyLinkedList extends MyAbstractList {
    private MyNode top;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        this.top = null;
    }

    @Override
    public int size() {
        int count = 0;
        MyNode current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
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

    @Override
    public void insert(double data, int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            MyNode newNode = new MyNode(data, top, null);
            if (top != null) {
                top.previous = newNode;
            }
            top = newNode;
        } else {
            MyNode current = getNodeByIndex(index - 1);
            MyNode newNode = new MyNode(data, current.next, current);
            if (current.next != null) {
                current.next.previous = newNode;
            }
            current.next = newNode;
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            top = top.next;
            if (top != null) {
                top.previous = null;
            }
        } else {
            MyNode toRemove = getNodeByIndex(index);
            if (toRemove.previous != null) {
                toRemove.previous.next = toRemove.next;
            }
            if (toRemove.next != null) {
                toRemove.next.previous = toRemove.previous;
            }
        }
    }

    @Override
    public MyLinkedList sortIncreasing() {
        MyLinkedList sorted = new MyLinkedList();
        MyIterator iterator = iterator(0);
        while (iterator.hasNext()) {
            sorted.add(iterator.next().doubleValue());
        }
        for (int i = 0; i < sorted.size() - 1; i++) {
            MyNode nodeI = sorted.getNodeByIndex(i);
            for (int j = i + 1; j < sorted.size(); j++) {
                MyNode nodeJ = sorted.getNodeByIndex(j);
                if (nodeI.data > nodeJ.data) {
                    double temp = nodeI.data;
                    nodeI.data = nodeJ.data;
                    nodeJ.data = temp;
                }
            }
        }
        return sorted;
    }

    @Override
    public int binarySearch(double data) {
        MyLinkedList sorted = sortIncreasing();
        int left = 0;
        int right = sorted.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            MyNode midNode = sorted.getNodeByIndex(mid);
            if (midNode.data == data) {
                return mid;
            } else if (midNode.data < data) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     * @return
     */
    @Override
    public MyIterator iterator(int start) {
        return new MyLinkedListIterator(start);
    }

    /**
     * Lấy node ở vị trí index.
     * @param index
     * @return
     */
    private MyNode getNodeByIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        MyNode current = top;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    private class MyLinkedListIterator implements MyIterator {
        /*
         * Vị trí hiện tại của iterator trong list.
         */
        private int currentPosition;

        /**
         * Khởi tạo cho iterator ở vị trí position trong MyLinkedList.
         * @param position
         */
        public MyLinkedListIterator(int position) {
            this.currentPosition = position;
        }

        @Override
        public boolean hasNext() {
            return currentPosition < size();
        }

        @Override
        public Number next() {
            MyNode node = getNodeByIndex(currentPosition);
            currentPosition++;
            return node.data;
        }

        @Override
        public void remove() {
            MyLinkedList.this.remove(currentPosition - 1);
            currentPosition--;
        }
    }
}
