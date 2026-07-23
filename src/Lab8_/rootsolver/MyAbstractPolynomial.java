package Lab8_.rootsolver;

public abstract class MyAbstractPolynomial implements MyPolynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        double[] coeffs = coefficients();
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < coeffs.length; i++) {
            if (i > 0) {
                sb.append(" + ");
            }
            sb.append(coeffs[i]);
            if (i == 1) {
                sb.append("x");
            } else if (i > 1) {
                sb.append("x^").append(i);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        double[] coeffs = coefficients();
        if (coeffs.length <= 1) {
            return new double[0];
        }
        double[] derivative = new double[coeffs.length - 1];
        for (int i = 1; i < coeffs.length; i++) {
            derivative[i - 1] = coeffs[i] * i;
        }
        return derivative;
    }
}
