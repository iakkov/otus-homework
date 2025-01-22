package hello.world.pack.lesson29.classWork;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("src\\hello\\world\\pack\\lesson29\\classWork\\1.txt", StandardCharsets.US_ASCII)) {
            int byteRead;
            while((byteRead = fileReader.read()) != -1) {
                System.out.print((char) byteRead);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
