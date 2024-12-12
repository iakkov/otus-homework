package hello.world.pack.lesson20;
import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    private static final File FILE = new File("src/hello/world/pack/lesson20/files");
    private static File[] arrayFile = FILE.listFiles();

    public static void main(String[] args) {
        fileList(arrayFile);
    }
    public static void fileList(File[] array) {
        for (int i = 0; i < array.length; i++) {
            String string = String.valueOf(array[i]);
            StringBuilder stringBuilder = new StringBuilder(string);
            int n = string.lastIndexOf("\\");
            String newString = stringBuilder.substring(n + 1, string.length());
            System.out.println(newString);
        }
    }

}
