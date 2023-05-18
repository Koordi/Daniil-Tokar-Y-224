
import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во палочек ");
        long n = scanner.nextLong();
        String winner = findWinner(n, "Саша");
        System.out.println("ПОБЕДИТЕЛЬ: " + winner + ".");
    }

    public static String findWinner(long n, String player) {
        if (n == 1) {
            return player;
        } else if (n % 2 == 0) {
            return findWinner(n / 2, player.equals("Саша") ? "Таня" : "Саша");
        } else {
            return player;
        }
    }
}