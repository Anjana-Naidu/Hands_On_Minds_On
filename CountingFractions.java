import java.util.Scanner;

public class CountingFractions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.print("Enter the limit for d (e.g., 12000): ");
        int limit = scanner.nextInt();

        int count = 0;

        // Iteration of all denominators
        for (int d = 2; d <= limit; d++) {
            int lowerBound = d / 3 + 1;   // Ensures n > d/3
            int upperBound = (d - 1) / 2; // Ensures n < d/2

            // Iterate through possible numerators
            for (int n = lowerBound; n <= upperBound; n++) {
                // GCD calculation without a separate function
                int a = n, b = d;
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                if (a == 1) {  // GCD == 1 means reduced proper fraction
                    count++;
                }
            }
        }

        // Display the result
        System.out.println("Number of fractions between 1/3 and 1/2 for d ≤ " + limit + ": " + count);
        
        scanner.close();
    }
}
