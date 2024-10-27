package hello.world.pack;

public class Lesson7 {
    public static void main(String[] args) {
        int[][] array = {{2, 4, 6, -5, -10}, {5, -8, 0, 1, -7}};
        System.out.println(sumOfPositiveElements(array));
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
}
