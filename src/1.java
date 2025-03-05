import java.util.Random;

public class MathHomework {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(10) + 1; // generate random number between 1 and 10
        int b = rand.nextInt(10) + 1; // generate random number between 1 and 10
        System.out.println("What is " + a + " x " + b);
    }
}