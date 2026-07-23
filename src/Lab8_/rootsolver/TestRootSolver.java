package Lab8_.rootsolver;

public class TestRootSolver {
    private PolynomialRootFinder rootFinder;

    public TestRootSolver(PolynomialRootFinder rootFinder) {
        this.rootFinder = rootFinder;
    }

    public static void main(String[] args) {
        TestRootSolver test = new TestRootSolver(new PolynomialRootFinder());
        test.testMyArrayPolynomial();
        test.testMyListPolynomial();
        test.testMyLinkedListPolynomial();
    }

    public void testMyArrayPolynomial() {
        java.util.Random random = new java.util.Random();
        int size = 3 + random.nextInt(5);
        
        MyArrayPolynomial poly = new MyArrayPolynomial();
        for (int i = 0; i < size; i++) {
            poly.addAtEnd(random.nextDouble() * 10 - 5);
        }
        
        System.out.println("Original polynomial: " + poly.toString());
        
        poly.addAtStart(1.0);
        System.out.println("After addAtStart(1.0): " + poly.toString());
        
        poly.addAtEnd(2.0);
        System.out.println("After addAtEnd(2.0): " + poly.toString());
        
        poly.addAtPosition(1, 3.0);
        System.out.println("After addAtPosition(1, 3.0): " + poly.toString());
        
        poly.set(0, 5.0);
        System.out.println("After set(0, 5.0): " + poly.toString());
        
        MyArrayPolynomial poly2 = new MyArrayPolynomial();
        for (int i = 0; i < size; i++) {
            poly2.addAtEnd(random.nextDouble() * 10 - 5);
        }
        System.out.println("Second polynomial: " + poly2.toString());
        
        MyArrayPolynomial sum = poly.plus(poly2);
        System.out.println("Sum: " + sum.toString());
        
        MyArrayPolynomial diff = poly.minus(poly2);
        System.out.println("Difference: " + diff.toString());
        
        MyArrayPolynomial product = poly.multiply(poly2);
        System.out.println("Product: " + product.toString());
        
        double x = 2.0;
        System.out.println("Evaluate at x=" + x + ": " + poly.evaluate(x));
        
        MyArrayPolynomial derivative = poly.derivative();
        System.out.println("Derivative: " + derivative.toString());
        
        double a = -10, b = 10;
        while (poly.evaluate(a) * poly.evaluate(b) >= 0) {
            a = random.nextDouble() * 20 - 10;
            b = random.nextDouble() * 20 - 10;
        }
        
        System.out.println("Finding root in interval [" + a + ", " + b + "]");
        
        RootSolver bisection = new BisectionSolver(1e-6, 1000);
        RootSolver newton = new NewtonRaphsonSolver(1e-6, 1000);
        RootSolver secant = new SecantSolver(1e-6, 1000);
        
        PolynomialRootFinder finder = new PolynomialRootFinder(poly, bisection);
        double rootBisection = finder.solve(a, b);
        System.out.println("Bisection root: " + rootBisection);
        
        finder.setRootSolver(newton);
        double rootNewton = finder.solve(a, b);
        System.out.println("Newton-Raphson root: " + rootNewton);
        
        finder.setRootSolver(secant);
        double rootSecant = finder.solve(a, b);
        System.out.println("Secant root: " + rootSecant);
        
        System.out.println();
    }

    public void testMyListPolynomial() {
        java.util.Random random = new java.util.Random();
        int size = 3 + random.nextInt(5);
        
        MyListPolynomial poly = new MyListPolynomial();
        for (int i = 0; i < size; i++) {
            poly.addAtEnd(random.nextDouble() * 10 - 5);
        }
        
        System.out.println("Original polynomial: " + poly.toString());
        
        poly.addAtStart(1.0);
        System.out.println("After addAtStart(1.0): " + poly.toString());
        
        poly.addAtEnd(2.0);
        System.out.println("After addAtEnd(2.0): " + poly.toString());
        
        poly.addAtPosition(1, 3.0);
        System.out.println("After addAtPosition(1, 3.0): " + poly.toString());
        
        poly.set(0, 5.0);
        System.out.println("After set(0, 5.0): " + poly.toString());
        
        MyListPolynomial poly2 = new MyListPolynomial();
        for (int i = 0; i < size; i++) {
            poly2.addAtEnd(random.nextDouble() * 10 - 5);
        }
        System.out.println("Second polynomial: " + poly2.toString());
        
        MyListPolynomial sum = poly.plus(poly2);
        System.out.println("Sum: " + sum.toString());
        
        MyListPolynomial diff = poly.minus(poly2);
        System.out.println("Difference: " + diff.toString());
        
        MyListPolynomial product = poly.multiply(poly2);
        System.out.println("Product: " + product.toString());
        
        double x = 2.0;
        System.out.println("Evaluate at x=" + x + ": " + poly.evaluate(x));
        
        MyListPolynomial derivative = poly.derivative();
        System.out.println("Derivative: " + derivative.toString());
        
        double a = -10, b = 10;
        while (poly.evaluate(a) * poly.evaluate(b) >= 0) {
            a = random.nextDouble() * 20 - 10;
            b = random.nextDouble() * 20 - 10;
        }
        
        System.out.println("Finding root in interval [" + a + ", " + b + "]");
        
        RootSolver bisection = new BisectionSolver(1e-6, 1000);
        RootSolver newton = new NewtonRaphsonSolver(1e-6, 1000);
        RootSolver secant = new SecantSolver(1e-6, 1000);
        
        PolynomialRootFinder finder = new PolynomialRootFinder(poly, bisection);
        double rootBisection = finder.solve(a, b);
        System.out.println("Bisection root: " + rootBisection);
        
        finder.setRootSolver(newton);
        double rootNewton = finder.solve(a, b);
        System.out.println("Newton-Raphson root: " + rootNewton);
        
        finder.setRootSolver(secant);
        double rootSecant = finder.solve(a, b);
        System.out.println("Secant root: " + rootSecant);
        
        System.out.println();
    }

    public void testMyLinkedListPolynomial() {
        java.util.Random random = new java.util.Random();
        int size = 3 + random.nextInt(5);
        
        MyLinkedListPolynomial poly = new MyLinkedListPolynomial();
        for (int i = 0; i < size; i++) {
            poly.addAtEnd(random.nextDouble() * 10 - 5);
        }
        
        System.out.println("Original polynomial: " + poly.toString());
        
        poly.addAtStart(1.0);
        System.out.println("After addAtStart(1.0): " + poly.toString());
        
        poly.addAtEnd(2.0);
        System.out.println("After addAtEnd(2.0): " + poly.toString());
        
        poly.addAtPosition(1, 3.0);
        System.out.println("After addAtPosition(1, 3.0): " + poly.toString());
        
        poly.set(0, 5.0);
        System.out.println("After set(0, 5.0): " + poly.toString());
        
        MyLinkedListPolynomial poly2 = new MyLinkedListPolynomial();
        for (int i = 0; i < size; i++) {
            poly2.addAtEnd(random.nextDouble() * 10 - 5);
        }
        System.out.println("Second polynomial: " + poly2.toString());
        
        MyLinkedListPolynomial sum = poly.plus(poly2);
        System.out.println("Sum: " + sum.toString());
        
        MyLinkedListPolynomial diff = poly.minus(poly2);
        System.out.println("Difference: " + diff.toString());
        
        MyLinkedListPolynomial product = poly.multiply(poly2);
        System.out.println("Product: " + product.toString());
        
        double x = 2.0;
        System.out.println("Evaluate at x=" + x + ": " + poly.evaluate(x));
        
        MyLinkedListPolynomial derivative = poly.derivative();
        System.out.println("Derivative: " + derivative.toString());
        
        double a = -10, b = 10;
        while (poly.evaluate(a) * poly.evaluate(b) >= 0) {
            a = random.nextDouble() * 20 - 10;
            b = random.nextDouble() * 20 - 10;
        }
        
        System.out.println("Finding root in interval [" + a + ", " + b + "]");
        
        RootSolver bisection = new BisectionSolver(1e-6, 1000);
        RootSolver newton = new NewtonRaphsonSolver(1e-6, 1000);
        RootSolver secant = new SecantSolver(1e-6, 1000);
        
        PolynomialRootFinder finder = new PolynomialRootFinder(poly, bisection);
        double rootBisection = finder.solve(a, b);
        System.out.println("Bisection root: " + rootBisection);
        
        finder.setRootSolver(newton);
        double rootNewton = finder.solve(a, b);
        System.out.println("Newton-Raphson root: " + rootNewton);
        
        finder.setRootSolver(secant);
        double rootSecant = finder.solve(a, b);
        System.out.println("Secant root: " + rootSecant);
        
        System.out.println();
    }
}
