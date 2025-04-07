public class MathHomework {
    public static void main(String[] args) {
        // Example mathematical calculations
        System.out.println("The area of a rectangle is " + calculateArea(5, 3));
        System.out.println("The circumference of a circle is " + calculateCircumference(7, 2));
    }

    /**
     * Calculate the area of a rectangle.
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     * @return The area of the rectangle.
     */
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    /**
     * Calculate the circumference of a circle.
     * @param radius The radius of the circle.
     * @return The circumference of the circle.
     */
    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
