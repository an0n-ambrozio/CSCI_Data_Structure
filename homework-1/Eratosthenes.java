public class Eratosthenes {

    public static void sieve(int n) {
        boolean[] isComposite = new boolean[n + 1]; // defaults to false

        long start = System.nanoTime();

        for (int i = 2; i * i <= n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        long duration = System.nanoTime() - start;
        double seconds = duration / Math.pow(10, 9);

        // Debug: print primes < 100
        System.out.print("Primes less than 100: ");
        for (int i = 2; i < 100; i++) {
            if (!isComposite[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Print five largest primes <= n
        System.out.print("Five largest primes up to " + n + ": ");
        int count = 0;
        for (int i = n; i >= 2 && count < 5; i--) {
            if (!isComposite[i]) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();

        System.out.printf("Time taken: %.6f seconds%n", seconds);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Eratosthenes <n>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        sieve(n);
    }
}