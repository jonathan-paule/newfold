import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Java Calculator");
            System.out.println("Menu:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = input.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = input.nextDouble();

            double result;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error! Division by zero.");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid operation.");
            }
        }

        input.close();
    }
}
