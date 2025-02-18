import java.net.*;
import java.io.*;
class TestServer
{
    public static void main(String ar[])
    {
        try
        {
            ServerSocket ss=new ServerSocket(8000);    
            System.out.println("\n Waiting...");
            Socket s=ss.accept();
            System.out.println("\n Connection Established");

            PrintStream pr=new PrintStream(s.getOutputStream());
            pr.println("create_directory");

            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            String s1=br.readLine();
            System.out.println(s1);
           
            Thread.sleep(10000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
    }
}
