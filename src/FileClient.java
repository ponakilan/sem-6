import java.io.*;
import java.net.*;

public class FileClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 8080);
            BufferedReader cmd = new BufferedReader(
                    new InputStreamReader(s.getInputStream())
            );
            PrintStream pr = new PrintStream(s.getOutputStream());

            String path = cmd.readLine();

            File f = new File(path);
            boolean created = f.mkdir();
            if (created) {
                pr.println("Directory created.");
            } else {
                pr.println("Directory not created.");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
