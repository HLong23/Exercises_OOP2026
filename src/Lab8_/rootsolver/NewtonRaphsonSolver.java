package Lab8_.rootsolver;

public class NewtonRaphsonSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public NewtonRaphsonSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    @Override
    public double solve(MyPolynomial polynomial, double lower, double upper) {
        double x = (lower + upper) / 2;
        
        for (int i = 0; i < maxIterations; i++) {
            double fx = polynomial.evaluate(x);
            if (Math.abs(fx) < tolerance) {
                return x;
            }
            
            MyPolynomial derivativePoly = polynomial.derivative();
            double[] derivativeCoeffs = derivativePoly.coefficients();
            double fPrimeX = 0;
            for (int j = 0; j < derivativeCoeffs.length; j++) {
                fPrimeX += derivativeCoeffs[j] * Math.pow(x, j);
            }
            
            if (Math.abs(fPrimeX) < tolerance) {
                break;
            }
            
            x = x - fx / fPrimeX;
        }
        
        return x;
    }
}
