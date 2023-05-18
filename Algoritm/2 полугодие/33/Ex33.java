import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во палочек ");
        long n = scanner.nextLong();

        long sashaSticks = n - sticksLeft(n, "Таня");
        long tanyaSticks = sticksLeft(n, "Таня");

        System.out.println("У Саши останется " + sashaSticks + " палочек");
        System.out.println("У Тани останется " + tanyaSticks + " палочек");
    }

    public static long sticksLeft(long n, String player) {
        if (n == 1) {
            if (player.equals("Tanya")) {
                return 1;
            } else {
                return 0;
            }
        } else if (n % 2 == 0) {
            if (player.equals("Таня")) {
                long half = n / 2;
                if (half % 2 == 0) {
                    return sticksLeft(half, "Саша") + half;
                } else {
                    return sticksLeft(half + 1, "Саша") + half;
                }
            } else {
                return sticksLeft(n - 1, "Таня");
            }
        } else {
            return sticksLeft(n - 1, "Таня");
        }
    }
}