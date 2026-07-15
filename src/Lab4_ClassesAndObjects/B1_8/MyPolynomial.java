package Lab4_ClassesAndObjects.B1_8;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public double evaluate(double x) {
        double result = 0;

        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }

        return result;
    }

    public MyPolynomial add(MyPolynomial another) {

        int max = Math.max(this.coeffs.length, another.coeffs.length);
        double[] result = new double[max];

        for (int i = 0; i < max; i++) {

            double a = (i < this.coeffs.length) ? this.coeffs[i] : 0;
            double b = (i < another.coeffs.length) ? another.coeffs[i] : 0;

            result[i] = a + b;
        }

        return new MyPolynomial(result);
    }

    public MyPolynomial multiply(MyPolynomial another) {

        double[] result = new double[this.getDegree()
                + another.getDegree() + 2];

        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < another.coeffs.length; j++) {
                result[i + j] += this.coeffs[i] * another.coeffs[j];
            }
        }

        return new MyPolynomial(result);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (int i = coeffs.length - 1; i >= 0; i--) {

            if (coeffs[i] == 0) {
                continue;
            }

            if (sb.length() > 0) {
                sb.append(" + ");
            }

            if (i == 0) {
                sb.append(coeffs[i]);
            } else if (i == 1) {
                sb.append(coeffs[i]).append("x");
            } else {
                sb.append(coeffs[i]).append("x^").append(i);
            }
        }

        return sb.toString();
    }
}
