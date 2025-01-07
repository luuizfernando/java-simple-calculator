import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Boolean operation = true;

        System.out.println("=== Simple Calculator ===");
        while (operation) {
            System.out.print("First number: ");
            double n1 = sc.nextDouble();

            System.out.print("Second number: ");
            double n2 = sc.nextDouble();

            System.out.println("Operation -> +, -, *, /");
            char op = sc.next().charAt(0);

            double result;

            switch (op) {
                case '+':
                    result = n1 + n2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = n1 - n2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = n1 * n2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if ( n2 != 0 ) {
                        result = n1 / n2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error");
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
            }

            System.out.println("Would you like to do more operations?(Y / N): ");
            char answer = sc.next().charAt(0);

            if (answer == 'n' || answer == 'N') {
                operation = false;
                System.out.println("Finishing");
            }
        }

        sc.close();
    }
}