public class QuadraticEquationService {
    public QuadraticRoot calculate(double a, double b, double c) {
        double x1, x2;
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        return new QuadraticRoot(x1, x2);
    }
}
