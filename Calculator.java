import java.util.Scanner;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scn = new Scanner(System.in);

        System.out.println("Simple Java Calculator");

        while (true) {
            System.out.print("\nEnter first number (or type 'exit' to quit): ");
            if (scn.hasNext("exit")) break;
            int a = scn.nextInt();

            System.out.print("Enter operator (+, -, *, /): ");
            String op = scn.next();

            System.out.print("Enter second number: ");
            int b = scn.nextInt();

            try {
                switch (op) {
                    case "+" -> System.out.println("Result: " + calc.add(a, b));
                    case "-" -> System.out.println("Result: " + calc.subtract(a, b));
                    case "*" -> System.out.println("Result: " + calc.multiply(a, b));
                    case "/" -> System.out.println("Result: " + calc.divide(a, b));
                    default -> System.out.println("Invalid operator");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Calculator exited.");
    }
}
