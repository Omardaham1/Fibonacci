public class Fibonacci {

    /**
     * Calculates the nth Fibonacci number.
     
     * @param n the index of the Fibonacci number
     * @return the nth Fibonacci number
     */
    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

    /**
     * Main entry point.
     
     * Accepts a command-line argument (index) and prints the corresponding Fibonacci number.
     
     * @param args command-line arguments (index)
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Fibonacci <number>");
        } else {
            try {
                int number = Integer.parseInt(args[0]);
                if (number < 0) {
                    System.out.println("Input should be a non-negative integer.");
                } else {
                    int result = calculateFibonacci(number);
                    System.out.println("Fibonacci number at index " + number + " is " + result);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }
}