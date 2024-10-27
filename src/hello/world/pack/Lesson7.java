package hello.world.pack;

public class Lesson7 {
    public static void main(String[] args) {
        int[][] array = {{2, 4, 6, -5, -10}, {5, -8, 0, 1, -7}};
        int[][] array1 = new int[5][5];
        System.out.println(sumOfPositiveElements(array));

        //printStarsSquare(5);
        fillArray(array1);
        printZeroDiagonal(array1);
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
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
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
}
