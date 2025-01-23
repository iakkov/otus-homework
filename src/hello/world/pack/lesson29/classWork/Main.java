package hello.world.pack.lesson29.classWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("src/hello/world/pack/lesson29/classWork/1.txt")) {
            byte[] buffer = new byte[1024];
            int length;
            while((length = fileInputStream.read(buffer)) != -1) {
                String data = new String(buffer, 0, length);
                System.out.print(data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream("src/hello/world/pack/lesson29/classWork/2.txt")) {
            for (char ch : "Hello World".toCharArray()) {
                fileOutputStream.write(ch);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
