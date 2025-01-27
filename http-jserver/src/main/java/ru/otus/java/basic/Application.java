package ru.otus.java.basic;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Application {
    public static void main(String[] args) {
        int port = 8189;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущен на порту " + port);
            try (Socket socket = serverSocket.accept()) {

                System.out.println("Подключился новый клиент");

                byte[] buffer = new byte[8192];
                int n = socket.getInputStream().read(buffer);
                String message = new String(buffer, 0, n);
                System.out.println(message);

                String response = "HTTP/1.1 200 OK\r\n" +
                        "Content-Type: text/html\r\n" +
                        "\r\n" +
                        "<html><body><h1>Hello World!</h1></body></html>";
                socket.getOutputStream().write(response.getBytes(StandardCharsets.UTF_8));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}