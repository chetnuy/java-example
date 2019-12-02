import sun.misc.IOUtils;
import sun.nio.ch.IOUtil;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import static sun.misc.IOUtils.*;

public class Client {
    public static final int PORT = 19000;
    public static final String HOST = "localhost";

    public static void main(String[] args) throws IOException {
        Socket socket = null;
        try {
            socket = new Socket(HOST, PORT);
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();


            String line = "salut";
            out.write(line.getBytes());
            out.flush();

           // byte [] data = new byte[32*1024];
            //int readBytes = in.read(data);

           // System.out.printf("Server>"+ new String(data,0,readBytes));

            }
        catch (IOException e){
            e.printStackTrace();

        }
        finally {
       }
    }
}
