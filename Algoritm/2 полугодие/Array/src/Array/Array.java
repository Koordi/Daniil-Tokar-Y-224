package Array;

public class Array {

    private int[][] array;

    public Array(int rows, int columns) {
        array = new int[rows][columns];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((Math.random()) * 10) + 1;
            }

        }
    }
    public int multiplyOfMainDiagonal() {
        int resultOfMultiplying = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j)
                    resultOfMultiplying *= array[i][j];

            }

        }
        return resultOfMultiplying;
    }

    public int additionOfDiogonalAbove() {
        int resultOfAddition = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i < j) {
                    resultOfAddition += array[i][j];

                }
            }

        }
        return resultOfAddition;
    }

    public int subtractionOfDiogonalUnder() {
        int resultOfSubtraction = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                if (i > j) {
                    resultOfSubtraction -= array[i][j];

                }
            }


        }
        return resultOfSubtraction;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int[] ints : array){
            for (int j = 0; j < array.length; j ++) {
                res.append("[").append(ints[j]).append("]");
            }
            res.append("\n");
        }
        return res.toString();
    }



}
