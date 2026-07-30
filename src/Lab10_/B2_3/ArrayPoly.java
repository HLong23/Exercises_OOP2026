package Lab10_.B2_3;

public class ArrayPoly extends AbstractPoly {

    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients.clone();
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        return new ArrayPoly(derive());
    }

    @Override
    public double coefficient(int degree) {

        if (degree < 0 || degree >= coefficients.length)
            return 0;

        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        return coefficients.clone();
    }
}
