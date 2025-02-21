import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        int N = Integer.parseInt(br.readLine());
        
        int[] ita = new int[N];
        
        for(int i=0; i<N; i++){
            ita[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(ita);
        
        for(int i=0; i<N; i++){
            sb.append(ita[i]+"\n");
        }
        System.out.println(sb);
    }
}