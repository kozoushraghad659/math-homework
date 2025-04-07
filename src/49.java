import java.util.*;

public class MathHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        double sum = num1 + num2;
        double product = num1 * num2;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
