import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 9999 ");
        int num = scanner.nextInt();
        String romanYear = arabicToRoman(num);
        System.out.println("Римский аналог " + num + " : " + romanYear);
    }

    private static String arabicToRoman(int num) throws IllegalArgumentException {
        if (num <= 0 || num >= 10000) {
            throw new IllegalArgumentException("Число должно быть в диапозоне от 1 до 9999");
        }
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        StringBuilder sb = new StringBuilder();
        sb.append(thousands[num / 1000]);
        sb.append(hundreds[(num % 1000) / 100]);
        sb.append(tens[(num % 100) / 10]);
        sb.append(ones[num % 10]);

        return sb.toString();
    }
}
