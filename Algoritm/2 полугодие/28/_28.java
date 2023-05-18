import java.util.Scanner;

public class _28 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Введите число (0 < n > 100000): ");
        int n = scanner.nextInt();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int j = n / i;

                if ((i + j) % 2 == 0 && (j - i) % 2 == 0) {
                    int x = (i + j) / 2;
                    int y = (j - i) / 2;

                    if ((x >= 1) && (x < 100000) && (y >= 1) && (y < 100000)) {
                        System.out.println("Разница между квадратами: " + x*x + "-" + y*y);
                        System.out.println("Числа квадратов: " + x + "," + y);
                    }
                }
            }
        }
    }
}