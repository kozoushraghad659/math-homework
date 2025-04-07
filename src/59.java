import java.util.Random;

public class MathHomework {
    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);
        
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
    }
}
