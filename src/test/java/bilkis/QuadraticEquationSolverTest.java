package bilkis;



public class QuadraticEquationSolverTest {

    public static void main(String[] args) {
        testRealAndDifferentRoots();
        testRealAndSameRoots();
        testComplexRoots();
    }

    public static void testRealAndDifferentRoots() {
        System.out.println("Testing Real and Different Roots:");
        testQuadraticEquation(1, -3, 2); // x^2 - 3x + 2 -> (x - 1)(x - 2) -> Roots: 1, 2
        System.out.println();
    }

    public static void testRealAndSameRoots() {
        System.out.println("Testing Real and Same Roots:");
        testQuadraticEquation(1, -2, 1); // x^2 - 2x + 1 -> (x - 1)^2 -> Root: 1
        System.out.println();
    }

    public static void testComplexRoots() {
        System.out.println("Testing Complex Roots:");
        testQuadraticEquation(1, 2, 5); // x^2 + 2x + 5 -> Roots: -1 + 2i, -1 - 2i
        System.out.println();
    }

    public static void testQuadraticEquation(double a, double b, double c) {
        System.out.println("Quadratic Equation: " + a + "x^2 + " + b + "x + " + c);
        QuadraticEquationSolver.solveQuadraticEquation(a, b, c);
    }
}
