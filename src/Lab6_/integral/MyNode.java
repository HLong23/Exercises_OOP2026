package Lab6_.integral;

public class MyNode {
    public double data;
    public MyNode previous;
    public MyNode next;

    public MyNode(double data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    public MyNode(double data, MyNode previous, MyNode next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }
}
