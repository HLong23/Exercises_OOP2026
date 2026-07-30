package Lab10_.B2_3;

public interface Poly {

    int degree();

    Poly derivative();

    double coefficient(int degree);

    double[] coefficients();
}
