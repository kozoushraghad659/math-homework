import java.util.Random;

public class MathHomework {
    private int number;
    
    public MathHomework(int number) {
        this.number = number;
    }
    
    public static void main(String[] args) {
        Random random = new Random();
        
        System.out.println("Randomly generated number: " + random.nextInt(10));
        System.out.println("Randomly generated number: " + random.nextInt(10));
        System.out.println("Randomly generated number: " + random.nextInt(10));
    }
}
