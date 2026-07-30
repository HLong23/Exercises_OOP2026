package Lab6_.polynomial;

/*
 * Tạo một đa thức với các hệ số được lưu trong biến coefficents. Hệ số tự do bắt đầu từ chỉ số 0.
 */
public class MyArrayPolynomial {
    private static final int DEFAULT_CAPACITY = 8;
    private double[] coefficients;
    private int length;

    /*
     * Khởi tạo dữ liệu mặc định.
     */
    public MyArrayPolynomial() {
        this.coefficients = new double[DEFAULT_CAPACITY];
        this.length = 0;
    }

    /*
     * Hàm trả về hệ số của đa thức ở vị trí index.
     */
    public double coefficient(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }
        return coefficients[index];
    }

    /*
     * Hàm trả về các hệ số của đa thức.
     */
    public double[] coefficients() {
        double[] result = new double[length];
        System.arraycopy(coefficients, 0, result, 0, length);
        return result;
    }

    /*
     * Hàm thêm vào một giá trị ở cuối mảng coefficients để nhận được một đa thức có bậc lớn hơn.
     */
    public void append(double coefficient) {
        if (length >= coefficients.length) {
            allocateMore();
        }
        coefficients[length] = coefficient;
        length++;
    }

    /*
     * Hàm thêm vào một giá trị ở vị trí index của mảng coefficients để nhận được một đa thức có bậc lớn hơn.
     */
    public void insert(double coefficient, int index) {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException();
        }
        if (length >= coefficients.length) {
            allocateMore();
        }
        System.arraycopy(coefficients, index, coefficients, index + 1, length - index);
        coefficients[index] = coefficient;
        length++;
    }

    /*
     * Hàm xóa giá trị ở vị trí index của mảng coefficients để nhận được một đa thức có bậc nhỏ hơn.
     */
    public void remove(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(coefficients, index + 1, coefficients, index, length - index - 1);
        length--;
    }

    /*
     * Hàm thay đổi giá trị ở vị trí index của mảng coefficients để nhận được một đa thức khác.
     */
    public void set(double coefficient, int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }
        coefficients[index] = coefficient;
    }

    /*
     * Hàm trả về bậc của đa thức.
     */
    public int degree() {
        return length - 1;
    }

    /*
     * Hàm tính giá trị của đa thức khi biết giá trị của biến độc lập x.
     */
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < length; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }

    /*
     * Hàm lấy đạo hàm của đa thức, trả về đa thức là đạo hàm của đa thức hiện tại.
     */
    public MyArrayPolynomial derivative() {
        MyArrayPolynomial result = new MyArrayPolynomial();
        for (int i = 1; i < length; i++) {
            result.append(coefficients[i] * i);
        }
        return result;
    }

    /*
     * Hàm cộng đa thức hiện tại với một đa thức khác, trả về đa thức là tổng của hai đa thức.
     */
    public MyArrayPolynomial plus(MyArrayPolynomial right) {
        int maxDegree = Math.max(this.degree(), right.degree());
        MyArrayPolynomial result = new MyArrayPolynomial();
        for (int i = 0; i <= maxDegree; i++) {
            double coeff = 0;
            if (i <= this.degree()) {
                coeff += this.coefficient(i);
            }
            if (i <= right.degree()) {
                coeff += right.coefficient(i);
            }
            result.append(coeff);
        }
        return result;
    }

    /*
     * Hàm trừ đa thức hiện tại cho một đa thức khác, trả về đa thức là hiệu của đa thức hiện tại trừ đi một đa thức khác đã cho.
     */
    public MyArrayPolynomial minus(MyArrayPolynomial right) {
        int maxDegree = Math.max(this.degree(), right.degree());
        MyArrayPolynomial result = new MyArrayPolynomial();
        for (int i = 0; i <= maxDegree; i++) {
            double coeff = 0;
            if (i <= this.degree()) {
                coeff += this.coefficient(i);
            }
            if (i <= right.degree()) {
                coeff -= right.coefficient(i);
            }
            result.append(coeff);
        }
        return result;
    }

    /*
     * Hàm nhân đa thức hiện tại với một đa thức khác, trả về đa thức là tích của hai đa thức.
     */
    public MyArrayPolynomial multiply(MyArrayPolynomial right) {
        int resultDegree = this.degree() + right.degree();
        MyArrayPolynomial result = new MyArrayPolynomial();
        for (int i = 0; i <= resultDegree; i++) {
            result.append(0);
        }
        for (int i = 0; i <= this.degree(); i++) {
            for (int j = 0; j <= right.degree(); j++) {
                double currentCoeff = result.coefficient(i + j);
                result.set(currentCoeff + this.coefficient(i) * right.coefficient(j), i + j);
            }
        }
        return result;
    }

    /*
     * Hàm cho phép tăng kích thước mảng lên gấp đôi để lưu các hệ số của đa thức, nếu mảng ban đầu đã sử dụng hết.
     */
    private void allocateMore() {
        double[] newCoefficients = new double[coefficients.length * 2];
        System.arraycopy(coefficients, 0, newCoefficients, 0, length);
        coefficients = newCoefficients;
    }

    /*
     * Hàm định dạng đa thức theo dạng: [a_nx^n + ... + a1x + a0]
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = degree(); i >= 0; i--) {
            double coeff = coefficient(i);
            if (coeff != 0 || i == 0) {
                if (i < degree() && coeff >= 0) {
                    sb.append(" + ");
                } else if (coeff < 0) {
                    sb.append(" - ");
                }
                sb.append(Math.abs(coeff));
                if (i > 0) {
                    sb.append("x");
                    if (i > 1) {
                        sb.append("^").append(i);
                    }
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
