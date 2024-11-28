package QuadraticEquationSolver;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients
        System.out.println("Enter the coefficient a:");
        double a = scanner.nextDouble();
        System.out.println("Enter the coefficient b:");
        double b = scanner.nextDouble();
        System.out.println("Enter the coefficient c:");
        double c = scanner.nextDouble();

        // Create an instance of the QuadraticEquation class
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        // Find roots
        equation.findRoots();

        scanner.close();
    }
}



    

