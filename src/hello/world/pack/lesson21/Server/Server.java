package hello.world.pack.lesson21.Server;

import hello.world.pack.lesson21.util.ClientHandler;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

    public class Server {
        private static final List<ClientHandler> clientHandlers = new ArrayList<>();

        public static void main(String[] args) throws IOException {
            ServerSocket socket = new ServerSocket(8080);
            System.out.println("SERVER APPLICATION RUN!");
            while (true) {
                try(Socket client = socket.accept();
                    DataInputStream inputStream = new DataInputStream(client.getInputStream());
                    DataOutputStream outputStream = new DataOutputStream(client.getOutputStream()))
                {
                    System.out.println("Клиент с портом :" + client.getPort() + " подключился!");
                    ClientHandler clientHandler = new ClientHandler(client, inputStream, outputStream);
                    clientHandlers.add(clientHandler);
                    outputStream.writeUTF("Введите выражение:");
                    String userInput = inputStream.readUTF();
                    if (userInput.equals("exit")) {
                        System.out.println("Клиент с портом :" + client.getPort() + " отключился!");
                        client.close();
                        continue;
                    }
                    outputStream.writeUTF(calculator(userInput));
                    outputStream.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    private static String calculator(String input) {
        String result = input.replaceAll("\\s", "");
        char operator = 0;
        int operatorIndex = -1;

        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operator = ch;
                operatorIndex = i;
                break;
            }
        }
        if (operatorIndex == -1) {
            return "Ошибка: не найдет оператор";
        }
        try {
            String part1 = result.substring(0, operatorIndex);
            String part2 = result.substring(operatorIndex + 1);
            double num1 = Double.parseDouble(part1);
            double num2 = Double.parseDouble(part2);
            double parsedResult = 0;

            switch (operator) {
                case '+':
                    parsedResult = num1 + num2;
                    return Double.toString(parsedResult);
                case '-':
                    parsedResult = num1 - num2;
                    return Double.toString(parsedResult);
                case '*':
                    parsedResult = num1 * num2;
                    return Double.toString(parsedResult);
                case '/':
                    if (num2 == 0) {
                        return "Ошибка: деление на ноль!";
                    }
                    parsedResult = num1 / num2;
                    return Double.toString(parsedResult);
                default:
                    return "Ошибка: неизвестный оператор!";
            }
        } catch (NumberFormatException e) {
            return "Некорректный ввод";
        }
    }
}
