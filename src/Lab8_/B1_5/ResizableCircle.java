package Lab8_.B1_5;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public double resize(int percent) {
        radius = radius * percent / 100.0;
        return radius;
    }

    @Override
    public String toString() {
        return "ResizableCircle[radius=" + radius + "]";
    }
}
