package hello.world.pack.lesson29.homework;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите имя файла: ");
            String fileName = console.nextLine();
            System.out.println("Введите искомую последовательность символов: ");
            String searchKey = console.nextLine();

            int overlaps = countOverlaps(fileName, searchKey);
            System.out.println("Количество раз, которое данная последовательность символов встречается в файле: " + overlaps);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static int countOverlaps(String fileName, String searchKey) {
        int count = 0;
        int searchLength = searchKey.length();
        String filePath = "src/hello/world/pack/lesson29/homework/";
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(new FileInputStream(String.valueOf(Paths.get(filePath, fileName))), StandardCharsets.UTF_8))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                for (int i = 0; i < line.length() - searchLength; i++) {
                    if(line.startsWith(searchKey, i)) {
                        count++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return count;
    }
}
