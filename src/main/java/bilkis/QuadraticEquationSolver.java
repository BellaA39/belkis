package bilkis;

import java.util.Scanner;

/**
 * This class solves quadratic equations and prints the roots.
 */
public class QuadraticEquationSolver {

    /**
     * The main method of the program.
     * It prompts the user to input coefficients of a quadratic equation
     * and then calls the solveQuadraticEquation method to solve the equation.
     * 
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        solveQuadraticEquation(a, b, c);
        
        scanner.close();
    }

    /**
     * Solves a quadratic equation and prints its roots.
     * 
     * @param a The coefficient of the x^2 term.
     * @param b The coefficient of the x term.
     * @param c The constant term.
     */
    public static void solveQuadraticEquation(double a, double b, double c) {
        double discriminant = calculateDiscriminant(a, b, c);
        
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            printRoots("Roots are real and different.", root1, root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            printRoots("Roots are real and same.", root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            printComplexRoots("Roots are complex and different.", realPart, imaginaryPart);
        }
    }
    
    /**
     * Calculates the discriminant of a quadratic equation.
     * 
     * @param a The coefficient of the x^2 term.
     * @param b The coefficient of the x term.
     * @param c The constant term.
     * @return The discriminant value.
     */
    private static double calculateDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
    
    /**
     * Prints the roots of a quadratic equation when they are real.
     * 
     * @param message The message indicating the type of roots.
     * @param roots The real roots of the equation.
     */
    private static void printRoots(String message, double... roots) {
        System.out.println(message);
        for (int i = 0; i < roots.length; i++) {
            System.out.println("Root " + (i + 1) + ": " + roots[i]);
        }
    }
    
    /**
     * Prints the roots of a quadratic equation when they are complex.
     * 
     * @param message The message indicating the type of roots.
     * @param realPart The real part of the complex roots.
     * @param imaginaryPart The imaginary part of the complex roots.
     */
    private static void printComplexRoots(String message, double realPart, double imaginaryPart) {
        System.out.println(message);
        System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
        System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
    }
}
