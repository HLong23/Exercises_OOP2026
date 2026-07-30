package Lab6_.statistics;

public class MyNode {
    public double data;
    public MyNode next;

    public MyNode(double data) {
        this.data = data;
        this.next = null;
    }

    public MyNode(double data, MyNode next) {
        this.data = data;
        this.next = next;
    }
}
