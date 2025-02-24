import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        
        String[] sta = sc.nextLine().split("");
        int[] ita = new int[sta.length];
        
        for(int i=0; i<sta.length; i++){
            ita[i] = Integer.parseInt(sta[i]);
        }
        
        Arrays.sort(ita);
        
        for(int i=sta.length-1; i>=0; i--){
            sb.append(ita[i]);
        }
        
        System.out.println(sb);
    }
}