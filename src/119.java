import java.util.Random;

public class MathHomework {

    private int number1;
    private int number2;
    private Random random = new Random();

    public MathHomework() {
        number1 = 5;
        number2 = 3;
    }

    // Add a random operation to the equations
    public void addRandomOperation() {
        if (random.nextInt(10) < 6) {
            int result = (number1 + number2);
            System.out.println("Result: " + result);
        } else {
            System.out.println("No operation selected.");
        }
    }

    // Subtract a random operation from the equations
    public void subtractRandomOperation() {
        if (random.nextInt(10) < 3) {
            int result = number1 - number2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("No operation selected.");
        }
    }

    // Multiply a random operation by the first equation
    public void multiplyRandomOperation() {
        if (random.nextInt(10) < 3) {
            int result = number1 * number2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("No operation selected.");
        }
    }

    // Divide a random operation by the first equation
    public void divideRandomOperation() {
        if (random.nextInt(10) < 3) {
            int result = number1 / number2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("No operation selected.");
        }
    }

    // Compare two random operations and print the result
    public void compareRandomOperations() {
        if (random.nextInt(10) < 3) {
            int result = number2 * number1;
            System.out.println("Result: " + result);
        } else {
            System.out.println("No operation selected.");
        }
    }

    // Randomly generate a random equation
    public void getRandomEquation() {
        String equation = "5 " + (random.nextInt(4) == 0 ? "-" : "+") + "3" + (number1 < number2 ? "*" : "/");
        System.out.println("Random equation: " + equation);
    }
}
