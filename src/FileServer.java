import java.io.*;
import java.net.*;

public class FileServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8080);
            Socket s = ss.accept();
            PrintStream out = new PrintStream(s.getOutputStream());
            out.println("C:\\Users\\ponak\\Downloads\\asd");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(s.getInputStream())
            );
            System.out.println(in.readLine());
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
