package Lab6_.integral;

public class IntegralCalculator {
    private MyPolynomial poly;

    private double precision;
    private int maxIterations;

    /*
     * Hàm khởi tạo đa thức cần tính tích phân.
     */
    public IntegralCalculator(MyPolynomial poly) {
        this.poly = poly;
        this.precision = 1e-6;
        this.maxIterations = 1000;
    }

    /*
     * Hàm khởi đa thức cần tính tích phân, độ chính xác tính toán và số vòng lặp tối đa.
     */
    public IntegralCalculator(MyPolynomial poly, double precision, int maxIterations) {
        this.poly = poly;
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    public void setPoly(MyPolynomial poly) {
        this.poly = poly;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

    public void setMaxIterations(int maxIterations) {
        this.maxIterations = maxIterations;
    }

    /*
     * Tính xấp xỉ giá trị tích phân theo phương pháp Midpoint Rule. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     */
    private double midpointRule(double lower, double upper, int numOfSubIntervals) {
        double h = (upper - lower) / numOfSubIntervals;
        double sum = 0;
        for (int i = 0; i < numOfSubIntervals; i++) {
            double midPoint = lower + (i + 0.5) * h;
            sum += poly.evaluate(midPoint);
        }
        return sum * h;
    }

    /*
     * Tính xấp xỉ giá trị tích phân theo phương pháp Midpoint Rule với numOfSubIntervals khoảng phân hoạch đều.
     */
    public double midpointRule(double lower, double upper) {
        int n = 1;
        double prevResult = midpointRule(lower, upper, n);
        for (int i = 0; i < maxIterations; i++) {
            n *= 2;
            double currentResult = midpointRule(lower, upper, n);
            if (Math.abs(currentResult - prevResult) / 3 < precision) {
                return currentResult;
            }
            prevResult = currentResult;
        }
        return prevResult;
    }

    /*
     * Tính xấp xỉ giá trị tích phân theo phương pháp Trapezoid Rule. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     */
    private double trapezoidRule(double lower, double upper, int numOfSubIntervals) {
        double h = (upper - lower) / numOfSubIntervals;
        double sum = (poly.evaluate(lower) + poly.evaluate(upper)) / 2;
        for (int i = 1; i < numOfSubIntervals; i++) {
            double x = lower + i * h;
            sum += poly.evaluate(x);
        }
        return sum * h;
    }

    /*
     * Tính xấp xỉ giá trị tích phân theo phương pháp Trapezoid Rule với numOfSubIntervals khoảng phân hoạch đều.
     */
    public double trapezoidRule(double lower, double upper) {
        int n = 1;
        double prevResult = trapezoidRule(lower, upper, n);
        for (int i = 0; i < maxIterations; i++) {
            n *= 2;
            double currentResult = trapezoidRule(lower, upper, n);
            if (Math.abs(currentResult - prevResult) / 3 < precision) {
                return currentResult;
            }
            prevResult = currentResult;
        }
        return prevResult;
    }

    /*
     * Tính xấp xỉ giá trị tích phân theo phương pháp Simpson's Rule. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     */
    private double simpsonRule(double lower, double upper, int numOfSubIntervals) {
        double h = (upper - lower) / numOfSubIntervals;
        double sum = poly.evaluate(lower) + poly.evaluate(upper);
        for (int i = 1; i < numOfSubIntervals; i++) {
            double x = lower + i * h;
            if (i % 2 == 0) {
                sum += 2 * poly.evaluate(x);
            } else {
                sum += 4 * poly.evaluate(x);
            }
        }
        return sum * h / 3;
    }

    /*
     * Tính xấp xỉ giá trị tích phân theo phương pháp phương pháp Simpson's Rule với numOfSubIntervals khoảng phân hoạch đều.
     */
    public double simpsonRule(double lower, double upper) {
        int n = 2;
        double prevResult = simpsonRule(lower, upper, n);
        for (int i = 0; i < maxIterations; i++) {
            n *= 2;
            double currentResult = simpsonRule(lower, upper, n);
            if (Math.abs(currentResult - prevResult) / 3 < precision) {
                return currentResult;
            }
            prevResult = currentResult;
        }
        return prevResult;
    }
}
