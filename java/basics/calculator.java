import java.util.Scanner;

class logic {
    public static void calculate(double x, double y) {
        System.out.println();
        double addition = addition(x, y);
        System.out.println("Add: " + addition);

        double subtract = subtraction(x, y);
        System.out.println("Minus: " + subtract);

        double multiplication = multiplication(x, y);
        System.out.println("Multiply: " + multiplication);

        double divide = division(x, y);
        System.out.println("Divide: " + divide);
    }

    private static double addition(double x, double y) {
        return (x + y);
    }

    private static double subtraction(double x, double y) {
        return (x - y);
    }

    private static double multiplication(double x, double y) {
        return (x * y);
    }

    private static double division(double x, double y) {
        return (x / y);
    }
}

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("X: ");
        double x = scanner.nextDouble(); 

        System.out.print("Y: ");
        double y = scanner.nextDouble();

        logic.calculate(x, y);

        scanner.close();
    }
}
