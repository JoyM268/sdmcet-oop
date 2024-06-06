//Program to demonstrate reading of data using Reader
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ReadWriteStreams {
    public static void main(String[] args) throws Exception {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        //OR
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String msg = "";
        while (!msg.equals("stop")) {
            System.out.println("Enter the data: ");
            msg = br.readLine();
            System.out.println("Message entered: " + msg);
        }
        System.out.println("Stopped");

    }

}