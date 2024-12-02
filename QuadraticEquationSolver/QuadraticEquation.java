package QuadraticEquationSolver;
    public class QuadraticEquation {
        private double a, b, c;
    
        // Constructor
        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    
        // Method to find and display roots
        public void findRoots() {
            if (a == 0) {
                System.out.println("The value of 'a' cannot be 0 for a quadratic equation.");
                return;
            }
    
            double discriminant = b * b - 4 * a * c;
    
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Roots are real and distinct:");
                System.out.println("Root 1 = " + root1);
                System.out.println("Root 2 = " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("Roots are real and equal:");
                System.out.println("Root = " + root);
            } else {
                System.out.println("No real roots exist. The roots are imaginary.");
            }
        }
    }
    
    
    
    
    

