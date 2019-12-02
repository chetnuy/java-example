package core.socket;

/**
 * Эхо сервер к которому можно подключиться телнетом
 * программа работает в один поток
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

    public static void main(String[] args) throws IOException {

// установить сокет на стороне сервера
try (ServerSocket s = new ServerSocket(8189))
    {
        // ожидать подключения клиента
        try (Socket incoming = s.accept())
        {
        InputStream inStream = incoming.getInputStream();
        OutputStream outStream = incoming.getOutputStream();
        try (Scanner in = new Scanner(inStream, "UTF-8"))
         {
        PrintWriter out = new PrintWriter(

        new OutputStreamWriter(outStream, "UTF-8"),
        true /* автоматическая очистка */);
        out.println("Hello! Enter BYE to exit.");
        // передать обратно данные, полученные от клиента
        boolean done = false;
        while (!done && in.hasNextLine())
        {
            String line = in.nextLine();
            out.println("Echo: " + line);
            if (line.trim().equals("BYE")) done = true;
                }
            }

        }
    }

}
}