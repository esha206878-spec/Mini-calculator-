import java.util.Scanner;

public class MiniCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MINI CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Choose an operation: ");

            choice = sc.nextInt();

            if (choice >= 1 && choice <= 5) {

                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                double result = 0;

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
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Error: Cannot divide by zero.");
                        }
                        break;

                    case 5:
                        result = num1 % num2;
                        System.out.println("Result: " + result);
                        break;
                }

            } else if (choice != 6) {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        System.out.println("Calculator closed. Goodbye!");
        sc.close();
    }
}