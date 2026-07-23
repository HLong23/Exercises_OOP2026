package Lab8_.rootsolver;

import java.util.List;

public class MyListPolynomial extends MyAbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyListPolynomial() {
        this.coefficients = new java.util.ArrayList<>();
    }

    @Override
    public double coefficientAt(int index) {
        if (index < 0 || index >= coefficients.size()) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return coefficients.get(index);
    }

    @Override
    public double[] coefficients() {
        double[] result = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            result[i] = coefficients.get(i);
        }
        return result;
    }

    @Override
    public void addAtStart(double coefficient) {
        coefficients.add(0, coefficient);
    }

    @Override
    public void addAtEnd(double coefficient) {
        coefficients.add(coefficient);
    }

    @Override
    public void addAtPosition(int index, double coefficient) {
        if (index < 0 || index > coefficients.size()) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        coefficients.add(index, coefficient);
    }

    @Override
    public void set(int index, double coefficient) {
        if (index < 0 || index >= coefficients.size()) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        coefficients.set(index, coefficient);
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coefficients.size(); i++) {
            result += coefficients.get(i) * Math.pow(x, i);
        }
        return result;
    }

    @Override
    public MyListPolynomial derivative() {
        double[] derivativeCoeffs = differentiate();
        MyListPolynomial result = new MyListPolynomial();
        for (double coeff : derivativeCoeffs) {
            result.addAtEnd(coeff);
        }
        return result;
    }

    @Override
    public MyListPolynomial plus(MyPolynomial another) {
        double[] otherCoeffs = another.coefficients();
        int maxSize = Math.max(coefficients.size(), otherCoeffs.length);
        MyListPolynomial result = new MyListPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double sum = 0;
            if (i < coefficients.size()) {
                sum += coefficients.get(i);
            }
            if (i < otherCoeffs.length) {
                sum += otherCoeffs[i];
            }
            result.addAtEnd(sum);
        }
        return result;
    }

    @Override
    public MyListPolynomial minus(MyPolynomial another) {
        double[] otherCoeffs = another.coefficients();
        int maxSize = Math.max(coefficients.size(), otherCoeffs.length);
        MyListPolynomial result = new MyListPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double diff = 0;
            if (i < coefficients.size()) {
                diff += coefficients.get(i);
            }
            if (i < otherCoeffs.length) {
                diff -= otherCoeffs[i];
            }
            result.addAtEnd(diff);
        }
        return result;
    }

    @Override
    public MyListPolynomial multiply(MyPolynomial another) {
        double[] otherCoeffs = another.coefficients();
        int resultSize = coefficients.size() + otherCoeffs.length - 1;
        MyListPolynomial result = new MyListPolynomial();
        for (int i = 0; i < resultSize; i++) {
            result.addAtEnd(0);
        }
        for (int i = 0; i < coefficients.size(); i++) {
            for (int j = 0; j < otherCoeffs.length; j++) {
                double current = result.coefficients.get(i + j);
                result.coefficients.set(i + j, current + coefficients.get(i) * otherCoeffs[j]);
            }
        }
        return result;
    }
}
