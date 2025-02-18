import java.net.*;
import java.io.*;

class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 8000);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String s1 = br.readLine();

            if (s1.equals("create_directory")) {
                File dir = new File("C:\\Users\\ponak\\temp");
                boolean created = dir.mkdir();
                PrintStream pr = new PrintStream(s.getOutputStream());

                if (created) {
                    pr.println("Directory created.");
                } else {
                    pr.println("Directory creation failed.");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}