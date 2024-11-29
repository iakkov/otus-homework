package hello.world.pack.lesson15;

public class Main {
    public static void main(String[] args) {

    }
    public static int changeToIntAndSum(String[][] array) throws AppArraySizeException, AppArrayDataException {
        if(array.length != 4 || !checkColumns(array)) {
            throw new AppArraySizeException("Массив не соответствует заданному размеру 4х4");
        }
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new AppArrayDataException("Неверные данные в ячейке [" + i + "][" + j +"]: " + array[i][j]);
                }
            }
        }
        return sum;
    }

    public static boolean checkColumns(String[][] array) {
        for(String[] row : array) {
            if(row.length != 4) {
                return false;
            }
        }
        return true;
    }
}
