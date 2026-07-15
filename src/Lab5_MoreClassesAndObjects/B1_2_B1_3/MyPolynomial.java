package Lab5_MoreClassesAndObjects.B1_2_B1_3;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] == 0) {
                continue;
            }

            if (result.length() > 0) {
                result.append(" + ");
            }

            if (i == 0) {
                result.append(coeffs[i]);
            } else if (i == 1) {
                result.append(coeffs[i]).append("x");
            } else {
                result.append(coeffs[i]).append("x^").append(i);
            }
        }

        if (result.length() == 0) {
            return "0";
        }

        return result.toString();
    }

    public double evaluate(double x) {
        double result = 0;

        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }

        return result;
    }

    public MyPolynomial add(MyPolynomial another) {
        int max = Math.max(coeffs.length, another.coeffs.length);
        double[] sum = new double[max];

        for (int i = 0; i < max; i++) {
            double a = (i < coeffs.length) ? coeffs[i] : 0;
            double b = (i < another.coeffs.length) ? another.coeffs[i] : 0;
            sum[i] = a + b;
        }

        return new MyPolynomial(sum);
    }

    public MyPolynomial multiply(MyPolynomial another) {
        double[] product = new double[coeffs.length + another.coeffs.length - 1];

        for (int i = 0; i < coeffs.length; i++) {
            for (int j = 0; j < another.coeffs.length; j++) {
                product[i + j] += coeffs[i] * another.coeffs[j];
            }
        }

        return new MyPolynomial(product);
    }
}
