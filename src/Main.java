public class Main {
    public static void main(String[] args) {
        QuadraticEquationService quadraticEquationService = new QuadraticEquationService();
        SumOfCoefficientService sumOfCoefficientService = new SumOfCoefficientService();
        double a, b, c;
        a = 3;
        b = 7;
        c = -10;
        System.out.println("Корни квадратного уравнения через дискриминант: ");
        QuadraticRoot quadraticRoot = quadraticEquationService.calculate(a, b, c);
        System.out.println("X1 = " + quadraticRoot.X1);
        System.out.println("X2 = " + quadraticRoot.X2);
        System.out.println();
        System.out.println("Корни квадратного уравнения через сумму коэффициентов: ");
        quadraticRoot = sumOfCoefficientService.calculate(a, b, c);
        System.out.println("X1 = " + quadraticRoot.X1);
        System.out.println("X2 = " + quadraticRoot.X2);
    }
}