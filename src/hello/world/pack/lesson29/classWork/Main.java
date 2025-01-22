package hello.world.pack.lesson29.classWork;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("src/hello/world/pack/lesson29/classWork/1.txt")) {
            int byteRead;
            while((byteRead = fileInputStream.read()) != -1) {
                System.out.print((char) byteRead);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
