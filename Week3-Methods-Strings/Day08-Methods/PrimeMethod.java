// day 8 - prime check using method
// moved the prime logic into a separate method
// cleaner than writing everything in main

public class PrimeMethod {
    // method returns true if prime, false if not
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // printing all primes from 1 to 50
        System.out.print("primes from 1 to 50: ");
        for (int i = 1; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
