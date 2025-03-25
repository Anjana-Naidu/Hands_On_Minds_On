public class RandomInt {
    public static void main(String[] args) {
        double expectedValue = 0.0;
        int BITS = 32;

        for (int i = 1; i < 100; i++) { // 100 iterations should provide sufficient precision
            double probAllBitsSet = 1.0;
            
            for (int bit = 0; bit < BITS; bit++) {
                probAllBitsSet *= (1.0 - Math.pow(0.5, i));
            }

            expectedValue += probAllBitsSet;
        }

        System.out.printf("Expected value of N: %.10f%n", expectedValue);
    }
}
