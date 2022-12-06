public class SumOfCoefficientService {
    public QuadraticRoot calculate(double a, double b, double c) {
      double sumOfCoefficient = a + b + c;
      double x1, x2;
      if (sumOfCoefficient == 0) {
        x1 = 1;
        x2 = (c / a);
        return new QuadraticRoot(x1, x2);
      } else {
          System.out.println("Параментры не подходят для текущего метода.");
      }
        return null;
    }
}
