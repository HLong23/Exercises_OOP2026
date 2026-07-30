package Lab6_.integral;

/*
 * Tạo một đa thức với các hệ số được lưu trong biến coefficents. Hệ số tự do bắt đầu từ chỉ số 0.
 */
public class MyPolynomial {
    private MyDoublyLinkedList coefficients;

    /*
     * Khởi tạo dữ liệu mặc định.
     */
    public MyPolynomial() {
        this.coefficients = new MyDoublyLinkedList();
    }

    /*
     * Hàm trả về hệ số của đa thức ở vị trí index.
     */
    public double coefficient(int index) {
        return coefficients.get(index);
    }

    /*
     * Hàm trả về các hệ số của đa thức.
     */
    public double[] coefficients() {
        return coefficients.toArray();
    }

    /*
     * Hàm thêm vào một giá trị ở cuối list coefficients để nhận được một đa thức có bậc lớn hơn.
     */
    public void append(double coefficient) {
        coefficients.append(coefficient);
    }

    /*
     * Hàm thêm vào một giá trị ở vị trí index của list coefficients để nhận được một đa thức có bậc lớn hơn.
     */
    public void insert(double coefficient, int index) {
        coefficients.insert(coefficient, index);
    }

    /*
     * Hàm xóa giá trị ở vị trí index của list coefficients để nhận được một đa thức có bậc nhỏ hơn.
     */
    public void remove(int index) {
        coefficients.remove(index);
    }

    /*
     * Hàm thay đổi giá trị ở vị trí index của list coefficients để nhận được một đa thức khác.
     */
    public void set(double coefficient, int index) {
        coefficients.set(coefficient, index);
    }

    /*
     * Hàm trả về bậc của đa thức.
     */
    public int degree() {
        return coefficients.size() - 1;
    }

    /*
     * Hàm tính giá trị của đa thức khi biết giá trị của biến độc lập x.
     */
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coefficients.size(); i++) {
            result += coefficient(i) * Math.pow(x, i);
        }
        return result;
    }

    /*
     * Hàm lấy đạo hàm của đa thức, trả về đa thức là đạo hàm của đa thức hiện tại.
     */
    public MyPolynomial derivative() {
        MyPolynomial result = new MyPolynomial();
        for (int i = 1; i < coefficients.size(); i++) {
            result.append(coefficient(i) * i);
        }
        return result;
    }

    /*
     * Hàm cộng đa thức hiện tại với một đa thức khác, trả về đa thức là tổng của hai đa thức.
     */
    public MyPolynomial plus(MyPolynomial another) {
        int maxDegree = Math.max(this.degree(), another.degree());
        MyPolynomial result = new MyPolynomial();
        for (int i = 0; i <= maxDegree; i++) {
            double coeff = 0;
            if (i <= this.degree()) {
                coeff += this.coefficient(i);
            }
            if (i <= another.degree()) {
                coeff += another.coefficient(i);
            }
            result.append(coeff);
        }
        return result;
    }

    /*
     * Hàm trừ đa thức hiện tại cho một đa thức khác, trả về đa thức là hiệu của đa thức hiện tại trừ đi một đa thức khác đã cho.
     */
    public MyPolynomial minus(MyPolynomial another) {
        int maxDegree = Math.max(this.degree(), another.degree());
        MyPolynomial result = new MyPolynomial();
        for (int i = 0; i <= maxDegree; i++) {
            double coeff = 0;
            if (i <= this.degree()) {
                coeff += this.coefficient(i);
            }
            if (i <= another.degree()) {
                coeff -= another.coefficient(i);
            }
            result.append(coeff);
        }
        return result;
    }

    /*
     * Hàm nhân đa thức hiện tại với một đa thức khác, trả về đa thức là tích của hai đa thức.
     */
    public MyPolynomial multiply(MyPolynomial another) {
        int resultDegree = this.degree() + another.degree();
        MyPolynomial result = new MyPolynomial();
        for (int i = 0; i <= resultDegree; i++) {
            result.append(0);
        }
        for (int i = 0; i <= this.degree(); i++) {
            for (int j = 0; j <= another.degree(); j++) {
                double currentCoeff = result.coefficient(i + j);
                result.set(currentCoeff + this.coefficient(i) * another.coefficient(j), i + j);
            }
        }
        return result;
    }

    /*
     * Hàm định dạng đa thức theo dạng: (a_nx^n + ... + a1x + a0)
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
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
        sb.append(")");
        return sb.toString();
    }
}
