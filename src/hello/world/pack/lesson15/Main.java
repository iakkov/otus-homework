package hello.world.pack.lesson15;

public class Main {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] incorrectArray = {
                {"1", "2", "3"},
                {"1", "2", "3"},
                {"1", "2", "3"}
        };
        try {
            System.out.println("Сумма элементов равна " + changeToIntAndSum(correctArray));
        }
        catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            System.out.println("Сумма элементов равна " + changeToIntAndSum(incorrectArray));
        }
        catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
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
