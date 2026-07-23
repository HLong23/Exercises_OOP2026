package Lab8_.rootsolver;

public class SecantSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public SecantSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    @Override
    public double solve(MyPolynomial polynomial, double lower, double upper) {
        double x0 = lower;
        double x1 = upper;
        
        for (int i = 0; i < maxIterations; i++) {
            double fx0 = polynomial.evaluate(x0);
            double fx1 = polynomial.evaluate(x1);
            
            if (Math.abs(fx1) < tolerance) {
                return x1;
            }
            
            if (Math.abs(fx1 - fx0) < tolerance) {
                break;
            }
            
            double x2 = x1 - fx1 * (x1 - x0) / (fx1 - fx0);
            x0 = x1;
            x1 = x2;
        }
        
        return x1;
    }
}
