import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
    
            System.out.print("Enter starting number: ");
            int start = input.nextInt();
            System.out.print("Enter ending number: ");
            int end = input.nextInt();

            int[] primes = new int[end - start + 1];
            int count = 0;

            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    primes[count] = i;
                    count++;
                }
            }
            System.out.println("\nPrime numbers between " + start + " and " + end + " are:");
            for (int i = 0; i < count; i++) {
                System.out.print(primes[i] + " ");
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
