import java.util.Random;

public class MathHomework {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(10); // Generate a random number between 0 and 9
        System.out.println("The random number generated is: " + x);
    }
}
