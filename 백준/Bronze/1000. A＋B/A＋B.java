import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] ab = br.readLine().split(" ");
        
        int a = Integer.parseInt(ab[0].trim());
        int b = Integer.parseInt(ab[1].trim());
        
        System.out.println(a+b);
        
    }
}