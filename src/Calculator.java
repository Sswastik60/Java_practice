import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Welcome to the Calculator!");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return;
        }
        System.out.printf("The result of %.2f %c %.2f = %.2f%n", num1, operator, num2, result);
// - %.2f → Formats a floating-point number (num1) with 2 decimal places.
// - %c → Represents a character (operator, like +, -, *, /).
// - %.2f → Another floating-point number (num2) with 2 decimal places.
// - %.2f → Displays the result of the operation with 2 decimal places.
// - %n → Inserts agg newline, ensuring output is neatly separated.
    }
}
    
}
