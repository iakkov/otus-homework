package hello.world.pack.lesson29.classWork;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("src/hello/world/pack/lesson29/classWork/1.txt")) {
            byte[] buffer = new byte[1024];
            int length;
            int byteRead;
            while((length = fileInputStream.read(buffer)) != -1) {
                String data = new String(buffer, 0, length);
                System.out.print(data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
