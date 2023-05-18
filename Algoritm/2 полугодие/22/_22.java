import java.util.Scanner;

public class _22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую сторону треугольника: ");
        int a = scanner.nextInt();

        System.out.println("Введите вторую сторону треугольника: ");
        int b = scanner.nextInt();

        System.out.println("Введите третью сторону треугольника: ");
        int c = scanner.nextInt();

        System.out.println(squareOfTriangle(a,b,c));


    }

    public static double squareOfTriangle(double x, double y, double z) {
        double s;
        double p = (x + y + z) / 2;

        s = Math.sqrt((p * (p - x) * (p - y) * (p - z)));
        return s;
    }
}
