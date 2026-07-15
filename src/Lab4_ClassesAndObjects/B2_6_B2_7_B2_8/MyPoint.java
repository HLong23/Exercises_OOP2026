package Lab4_ClassesAndObjects.B2_6_B2_7_B2_8;

public class MyPoint {

    private int x;
    private int y;

    // Constructors
    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    // Distance to another coordinate
    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Distance to another point
    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    // Distance to origin
    public double distance() {
        return distance(0, 0);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

