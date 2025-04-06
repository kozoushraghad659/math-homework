public class MathHomework {
    public static void main(String[] args) {
        // Randomly generating a number between 1 and 100
        int randomNumber = (int)(Math.random() * 100 + 1);
        System.out.println("Random number generated: " + randomNumber);
        
        // Randomly choosing an option from a list of options
        String[] options = {"Option A", "Option B", "Option C"};
        int randomIndex = new Random().nextInt(options.length);
        System.out.println("You chose: " + options[randomIndex]);
    }
}
