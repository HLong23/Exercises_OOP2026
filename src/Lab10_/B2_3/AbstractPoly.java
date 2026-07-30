package Lab10_.B2_3;

import java.util.Arrays;

abstract class AbstractPoly implements Poly {

    protected double[] derive() {

        if (degree() == 0) {
            return new double[]{0};
        }

        double[] result = new double[degree()];

        for (int i = 1; i < coefficients().length; i++) {
            result[i - 1] = coefficients()[i] * i;
        }

        return result;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (!(o instanceof Poly))
            return false;

        Poly p = (Poly) o;

        return Arrays.equals(coefficients(), p.coefficients());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coefficients());
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (int i = degree(); i >= 0; i--) {

            double c = coefficient(i);

            if (c == 0)
                continue;

            if (sb.length() > 0)
                sb.append(" + ");

            if (i == 0) {
                sb.append(c);
            } else if (i == 1) {
                sb.append(c).append("x");
            } else {
                sb.append(c).append("x^").append(i);
            }
        }

        return sb.toString();
    }
}
