import java.util.Scanner;

public class _24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите M: ");
        int M = scanner.nextInt();

        System.out.print("Введите N: ");
        int N = scanner.nextInt();

        System.out.print("Введите число делителей: ");
        int numDivisors = scanner.nextInt();

        System.out.print("Введите делители: ");
        int[] divisors = new int[numDivisors];
        for (int i = 0; i < numDivisors; i++) {
            divisors[i] = scanner.nextInt();
        }

        for (int divisor : divisors) {
            int sum = 0;
            for (int num = M; num <= N; num++) {
                if (num % divisor == 0) {
                    sum += num;
                }
            }
            System.out.println(divisor + ": " + sum);
        }
    }
}

