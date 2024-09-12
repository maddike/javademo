public class Factorial {

    // Recursive method to calculate factorial
    public static long factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5; // You can change this number to test other values
        System.out.println("Factorial of " + number + " (recursive) is: " + factorialRecursive(number));
    }
}
