package Lab8_.rootsolver;

public class MyLinkedListPolynomial extends MyAbstractPolynomial {
    private MyLinkedList polynomial;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedListPolynomial() {
        this.polynomial = new MyLinkedList();
    }

    @Override
    public double coefficientAt(int index) {
        return polynomial.get(index);
    }

    @Override
    public double[] coefficients() {
        double[] result = new double[polynomial.size()];
        for (int i = 0; i < polynomial.size(); i++) {
            result[i] = polynomial.get(i);
        }
        return result;
    }

    @Override
    public void addAtStart(double coefficient) {
        polynomial.insert(coefficient, 0);
    }

    @Override
    public void addAtEnd(double coefficient) {
        polynomial.add(coefficient);
    }

    @Override
    public void addAtPosition(int index, double coefficient) {
        polynomial.insert(coefficient, index);
    }

    @Override
    public void set(int index, double coefficient) {
        polynomial.set(coefficient, index);
    }

    @Override
    public int degree() {
        return polynomial.size() - 1;
    }

    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < polynomial.size(); i++) {
            result += polynomial.get(i) * Math.pow(x, i);
        }
        return result;
    }

    @Override
    public MyLinkedListPolynomial derivative() {
        double[] derivativeCoeffs = differentiate();
        MyLinkedListPolynomial result = new MyLinkedListPolynomial();
        for (double coeff : derivativeCoeffs) {
            result.addAtEnd(coeff);
        }
        return result;
    }

    @Override
    public MyLinkedListPolynomial plus(MyPolynomial another) {
        double[] otherCoeffs = another.coefficients();
        int maxSize = Math.max(polynomial.size(), otherCoeffs.length);
        MyLinkedListPolynomial result = new MyLinkedListPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double sum = 0;
            if (i < polynomial.size()) {
                sum += polynomial.get(i);
            }
            if (i < otherCoeffs.length) {
                sum += otherCoeffs[i];
            }
            result.addAtEnd(sum);
        }
        return result;
    }

    @Override
    public MyLinkedListPolynomial minus(MyPolynomial another) {
        double[] otherCoeffs = another.coefficients();
        int maxSize = Math.max(polynomial.size(), otherCoeffs.length);
        MyLinkedListPolynomial result = new MyLinkedListPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double diff = 0;
            if (i < polynomial.size()) {
                diff += polynomial.get(i);
            }
            if (i < otherCoeffs.length) {
                diff -= otherCoeffs[i];
            }
            result.addAtEnd(diff);
        }
        return result;
    }

    @Override
    public MyLinkedListPolynomial multiply(MyPolynomial another) {
        double[] otherCoeffs = another.coefficients();
        int resultSize = polynomial.size() + otherCoeffs.length - 1;
        MyLinkedListPolynomial result = new MyLinkedListPolynomial();
        for (int i = 0; i < resultSize; i++) {
            result.addAtEnd(0);
        }
        for (int i = 0; i < polynomial.size(); i++) {
            for (int j = 0; j < otherCoeffs.length; j++) {
                double current = result.polynomial.get(i + j);
                result.polynomial.set(current + polynomial.get(i) * otherCoeffs[j], i + j);
            }
        }
        return result;
    }
}
