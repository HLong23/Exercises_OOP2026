package Lab10_.B2_3;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {

    private List<Double> coefficients;

    public ListPoly(double[] coeffs) {

        coefficients = new ArrayList<>();

        for (double d : coeffs) {
            coefficients.add(d);
        }
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }

    @Override
    public double coefficient(int degree) {

        if (degree < 0 || degree >= coefficients.size())
            return 0;

        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {

        double[] result = new double[coefficients.size()];

        for (int i = 0; i < coefficients.size(); i++) {
            result[i] = coefficients.get(i);
        }

        return result;
    }
}
