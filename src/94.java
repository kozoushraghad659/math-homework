import org.javatuples.Pair;

public class MathHomework {
    public static void main(String[] args) {
        System.out.println("Hello, this is the solution to the math homework.");
        int a = 5;
        double b = -3.0;
        Pair<Integer, Integer> result = (a + b, a * b);
        System.out.println(result);
    }
}
