package hello.world.pack.lesson20;
import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/hello/world/pack/lesson20/files");
        File[] arrayFile = file.listFiles();
        for (int i = 0; i < file.listFiles().length; i++) {
            String string = String.valueOf(arrayFile[i]);
            StringBuilder stringBuilder = new StringBuilder(string);
            int n = string.lastIndexOf("\\");
            String newString = stringBuilder.substring(n + 1, string.length());
            System.out.println(newString);
        }
        

    }

}
