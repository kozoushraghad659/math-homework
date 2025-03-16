import java.util.*;
public class MathHomework {
    public static void main(String[] args) {
        // Generate a random math problem
        int a = (int)(Math.random()*10+1);
        int b = (int)(Math.random()*10+1);
        char op = "+-*/".charAt((int)(Math.random()*3));
        System.out.print("What is " + a + " " + op + " " + b + "?");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        if (op == '+') {
            if (a + b == answer) System.out.println("Correct!");
            else System.out.println("Incorrect, the answer is " + (a + b));
        } else if (op == '-') {
            if (a - b == answer) System.out.println("Correct!");
            else System.out.println("Incorrect, the answer is " + (a - b));
        } else if (op == '*') {
            if (a * b == answer) System.out.println("Correct!");
            else System.out.println("Incorrect, the answer is " + (a * b));
        } else if (op == '/') {
            if ((double)a / b == answer) System.out.println("Correct!");
            else System.out.println("Incorrect, the answer is " + (double)a / b);
        }
    }
}