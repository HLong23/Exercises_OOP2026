package Lab8_.rootsolver;

public class MyArrayPolynomial extends MyAbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 8;
    private double[] coefficents;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyArrayPolynomial() {
        this.coefficents = new double[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public double coefficientAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return coefficents[index];
    }

    @Override
    public double[] coefficients() {
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = coefficents[i];
        }
        return result;
    }

    @Override
    public void addAtStart(double coefficient) {
        if (size == coefficents.length) {
            allocateMore();
        }
        for (int i = size; i > 0; i--) {
            coefficents[i] = coefficents[i - 1];
        }
        coefficents[0] = coefficient;
        size++;
    }

    @Override
    public void addAtEnd(double coefficient) {
        if (size == coefficents.length) {
            allocateMore();
        }
        coefficents[size] = coefficient;
        size++;
    }

    @Override
    public void addAtPosition(int index, double coefficient) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        if (size == coefficents.length) {
            allocateMore();
        }
        for (int i = size; i > index; i--) {
            coefficents[i] = coefficents[i - 1];
        }
        coefficents[index] = coefficient;
        size++;
    }

    @Override
    public void set(int index, double coefficient) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        coefficents[index] = coefficient;
    }

    @Override
    public int degree() {
        return size - 1;
    }

    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < size; i++) {
            result += coefficents[i] * Math.pow(x, i);
        }
        return result;
    }

    @Override
    public MyArrayPolynomial derivative() {
        double[] derivativeCoeffs = differentiate();
        MyArrayPolynomial result = new MyArrayPolynomial();
        for (double coeff : derivativeCoeffs) {
            result.addAtEnd(coeff);
        }
        return result;
    }

    @Override
    public MyArrayPolynomial plus(MyPolynomial another) {
        double[] otherCoeffs = another.coefficients();
        int maxSize = Math.max(size, otherCoeffs.length);
        MyArrayPolynomial result = new MyArrayPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double sum = 0;
            if (i < size) {
                sum += coefficents[i];
            }
            if (i < otherCoeffs.length) {
                sum += otherCoeffs[i];
            }
            result.addAtEnd(sum);
        }
        return result;
    }

    @Override
    public MyArrayPolynomial minus(MyPolynomial another) {
        double[] otherCoeffs = another.coefficients();
        int maxSize = Math.max(size, otherCoeffs.length);
        MyArrayPolynomial result = new MyArrayPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double diff = 0;
            if (i < size) {
                diff += coefficents[i];
            }
            if (i < otherCoeffs.length) {
                diff -= otherCoeffs[i];
            }
            result.addAtEnd(diff);
        }
        return result;
    }

    @Override
    public MyArrayPolynomial multiply(MyPolynomial another) {
        double[] otherCoeffs = another.coefficients();
        int resultSize = size + otherCoeffs.length - 1;
        MyArrayPolynomial result = new MyArrayPolynomial();
        for (int i = 0; i < resultSize; i++) {
            result.addAtEnd(0);
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < otherCoeffs.length; j++) {
                result.coefficents[i + j] += coefficents[i] * otherCoeffs[j];
            }
        }
        return result;
    }

    /**
     * Thêm kích thước mảng gấp đôi để lưu đa thức khi cần thiết.
     */
    private void allocateMore() {
        double[] newCoeffs = new double[coefficents.length * 2];
        for (int i = 0; i < size; i++) {
            newCoeffs[i] = coefficents[i];
        }
        coefficents = newCoeffs;
    }
}
