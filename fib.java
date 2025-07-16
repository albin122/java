import java.util.Scanner;
public class fib {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        if (n >= 1) {
            System.out.print(firstTerm);
        }
        if (n >= 2) {
            System.out.print(" " + secondTerm);
        }

        for (int i = 2; i < n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        scanner.close();
    }

}
