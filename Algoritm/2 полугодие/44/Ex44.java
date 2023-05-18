import java.math.BigInteger;
import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1;
        String num2;
        do {
            System.out.print("Введите первое положительное число: ");
            num1 = scanner.next();
            System.out.print("Введите второе положительное число: ");
            num2 = scanner.next();
        } while (!isPositive(num1) || !isPositive(num2));

        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger sum = a.add(b);

        System.out.println("Сумма двух чисел: " + sum);
    }

    private static boolean isPositive(String num) {
        try {
            int n = Integer.parseInt(num);
            if (n < 0) {
                System.out.println("Неверно! Сумма должна быть > 0");
            }
            return n > 0;
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат ввода.");
            return false;
        }
    }
}