import java.util.Arrays;
import java.util.Scanner;

public class _18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите массив чисел: ");
        String input = scanner.nextLine();

        String[] sArray = input.split(" ");
        int[] array = new int[sArray.length];
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }

        int[] result = maxValueSplit(array);
        int maxVal = result[0];
        int maxIndex = result[1];

        int[] leftAr = Arrays.copyOfRange(array, 0, maxIndex);
        int[] rightAr = Arrays.copyOfRange(array, maxIndex + 1, array.length);

        System.out.println("Максимальное значение: " + maxVal);
        System.out.println("Массив слева: " + Arrays.toString(leftAr));
        System.out.println("Массив справа: " + Arrays.toString(rightAr));


    }

    public static int[] maxValueSplit(int[] arr) {

        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        return new int[]{arr[maxIndex], maxIndex};
    }

}