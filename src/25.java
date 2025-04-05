public class MathHomework {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 7;

        if (a > b && a > c) {
            System.out.println("The maximum value is " + a);
        } else if (b > a && b > c) {
            System.out.println("The maximum value is " + b);
        } else {
            System.out.println("The maximum value is " + c);
        }
    }
}
