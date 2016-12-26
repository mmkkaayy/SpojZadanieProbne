import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mjedr on 24.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(isr);
        String line="";
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int a = Integer.parseInt(line);
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int b = Integer.parseInt(line);
        System.out.println(a+b);
    }


}
