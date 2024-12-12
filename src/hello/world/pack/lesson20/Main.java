package hello.world.pack.lesson20;
import java.io.*;
import java.util.Scanner;

public class Main {
    private static final File FILE = new File("src/hello/world/pack/lesson20/files");
    private static final File[] arrayFile = FILE.listFiles();
    private static String[] fileNames = new String[arrayFile.length];
    private static boolean start = true;

    public static void main(String[] args) {
        fileList(arrayFile);
        while(start) {
            userWriteFileName();
        }


    }
    public static void fileList(File[] array) {
        for (int i = 0; i < array.length; i++) {
            String string = String.valueOf(array[i]);
            StringBuilder stringBuilder = new StringBuilder(string);
            int n = string.lastIndexOf("\\");
            String newString = stringBuilder.substring(n + 1, string.length());
            fileNames[i] = newString;
        }
        for (String s : fileNames) {
            System.out.println(s);
        }
        System.out.println("------------------");

    }
    public static void userWriteFileName() {
        System.out.println("Пожалуйста, введите ниже название файла, с которым Вы хотите продолжить работу. \nНазвание файла должно содержать расширение файла.");
        Scanner console = new Scanner(System.in);
        String fileName = console.nextLine();
        File file = new File(FILE + "\\" + fileName);
        if (!file.exists()) {
            System.out.println("Вы ввели неверное имя файла, или его не существует, повторите попытку.");
        }
        else {
            for (String s : fileNames) {
                if (fileName.equals(s)) {
                    readFile(file);
                    start = false;
                }
            }
        }
    }
    public static void readFile(File file) {
        try (BufferedInputStream buf = new BufferedInputStream(new FileInputStream(file));
                InputStreamReader in = new InputStreamReader(buf)) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
