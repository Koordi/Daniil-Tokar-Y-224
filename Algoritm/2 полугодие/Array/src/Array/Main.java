package Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк: ");
        int inputRows = scanner.nextInt();


        System.out.println("Введите кол-во столбцов: ");
        int inputColumns = scanner.nextInt();

        Array array = new Array(inputRows, inputColumns);

        System.out.println("Ваша матрица: " + "\n"  + array);

        System.out.println("Произведение элементов главной диагонали равно: " + array.multiplyOfMainDiagonal());
        System.out.println("Сумма элементов, находящихся выше главной диагонали равно: " + array.additionOfDiogonalAbove());
        System.out.println("Вычитание элементов, находящихся ниже главной диагонали равно: " + array.subtractionOfDiogonalUnder());



    }
}
