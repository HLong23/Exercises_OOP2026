package Lab8_.rootsolver;

public class BisectionSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public BisectionSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    @Override
    public double solve(MyPolynomial polynomial, double lower, double upper) {
        double a = lower;
        double b = upper;
        
        for (int i = 0; i < maxIterations; i++) {
            double mid = (a + b) / 2;
            double fMid = polynomial.evaluate(mid);
            
            if (Math.abs(fMid) < tolerance) {
                return mid;
            }
            
            double fA = polynomial.evaluate(a);
            if (fA * fMid < 0) {
                b = mid;
            } else {
                a = mid;
            }
        }
        
        return (a + b) / 2;
    }
}
