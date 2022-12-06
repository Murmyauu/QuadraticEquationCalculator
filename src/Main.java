public class Main {
    public static void main(String[] args) {
        QuadraticEquationService quadraticEquationService = new QuadraticEquationService();

        QuadraticRoot quadraticRoot = quadraticEquationService.calculate(1, 5, 4.5);
        System.out.println("X1 = " + quadraticRoot.X1);
        System.out.println("X2 = " + quadraticRoot.X2);
    }
}