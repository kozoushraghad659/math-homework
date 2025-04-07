public class MathHomework {

    public static void main(String[] args) {
        // Example of simple mathematical calculation
        int result = 5 + 3;
        System.out.println("The sum is: " + result);

        // Another example with variables and loops
        String text = "Hello, World!";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'w') {
                count++;
            }
        }

        System.out.println("The number of 'w' in the string is: " + count);
    }
}
