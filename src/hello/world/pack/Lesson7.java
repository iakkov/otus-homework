package hello.world.pack;

public class Lesson7 {
    public static void main(String[] args) {
        int[][] array = {{2, 4, 6, -5, -10}, {5, -8, 0, 1, -7}};
        int[][] array1 = new int[5][5];
        System.out.println(sumOfPositiveElements(array));

        //printStarsSquare(5);
        //fillArray(array1);
        //printZeroDiagonal(array1);
        //System.out.println(findMax(array));
        //System.out.println(calculateSumOfSecondRow(array));
    }
    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
    public static void printStarsSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printZeroDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, k = array[i].length - 1; j < array[i].length; j++, k--) {
                if (i == j) {
                    array[i][j] = 0;
                    System.out.print(array[i][j]);
                }
                else System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    public static void fillArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 1;
            }
        }
    }
    public static int findMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
    public static int calculateSumOfSecondRow(int[][] array) {
        int sum = 0;
        if (array.length < 2) return -1;
        for (int value : array[1]) {
            sum += value;
        }
        return sum;
    }
}
