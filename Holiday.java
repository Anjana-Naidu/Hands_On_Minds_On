                  //Every Day Is a Holiday//


import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no.of days in the year: ");
        int D = scanner.nextInt();

        if (D < 1) {
            System.out.println("Invalid input. D must be greater than 0.");
            //return;
        }

        double[] dp = new double[D + 1];

        dp[1] = 1;  // Base case: 1 day requires 1 emperor
        for (int d = 2; d <= D; d++) {
            dp[d] = dp[d - 1] + (double) D / (D - d + 1);
        }

        System.out.printf("E(%d) = %.4f%n", D, dp[D]);

        scanner.close();
    }
}
