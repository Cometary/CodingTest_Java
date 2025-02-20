import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] ita = new int[N];
        
        for(int i=0; i<N; i++){
            ita[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ita);    
        for(int i=0; i<N; i++){
            System.out.println(ita[i]);
        }
        
    }
}