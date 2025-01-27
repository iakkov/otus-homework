package ru.otus.java.basic;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Application {
    public static void main(String[] args) {
        int port = 8189;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущен на порту " + port);
            Socket socket = serverSocket.accept();
            System.out.println("Подключился новый клиент");

            byte[] buffer = new byte[8192];
            int n = socket.getInputStream().read(buffer);
            String message = new String(buffer, 0, n);
            System.out.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
