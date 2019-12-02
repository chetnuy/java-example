package core.socket;

/**
 * программа открывает сокет для telnet
 */

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TelnetConnect {
    public static void main(String[] args) {
        try (Socket s = new Socket("localhost", 8189);
             Scanner in = new Scanner(s.getInputStream(), "UTF-8")) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
