import java.util.Scanner;

public class ExpressionCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        
            System.out.print("Введіть значення a (double): ");
            double aDouble = scanner.nextDouble();
            System.out.print("Введіть значення b (double): ");
            double bDouble = scanner.nextDouble();

            System.out.println("Результат (double, double): " + calculate(aDouble, bDouble));
            System.out.println("Результат (int, double): " + calculate((int) aDouble, bDouble));
            System.out.println("Результат (double, int): " + (int) calculate(aDouble, (int) bDouble));
        }
    }

    public static double calculate(double a, double b) {
        return 1.0 / (a * b * b - 2 * b) + (1.0 / (3 * a * a + 2)) * b;
    }

    public static double calculate(int a, double b) {
        return 1.0 / (a * b * b - 2 * b) + (1.0 / (3 * a * a + 2)) * b;
    }

    public static double calculate(double a, int b) {
        return 1.0 / (a * b * b - 2 * b) + (1.0 / (3 * a * a + 2)) * b;
    }
}
