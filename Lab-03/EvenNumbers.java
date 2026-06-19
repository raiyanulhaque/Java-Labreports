import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter starting number: ");
            int start = sc.nextInt();
            System.out.print("Enter ending number: ");
            int end = sc.nextInt();

            int count = 0;
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            int[] evens = new int[count];
            int index = 0;
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    evens[index++] = i;
                }
            }
            System.out.println("\nEven numbers using while loop:");
            int i = 0;
            while (i < evens.length) {
                System.out.print(evens[i] + " ");
                i++;
            }
            System.out.println("\n\nEven numbers using do-while loop:");
            int j = 0;
            if (evens.length > 0) {  // to avoid empty do-while run
                do {
                    System.out.print(evens[j] + " ");
                    j++;
                } while (j < evens.length);
            } else {
                System.out.println("No even numbers in this range.");
            }
        }
    }
}
