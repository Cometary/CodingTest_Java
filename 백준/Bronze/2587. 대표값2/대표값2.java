import java.util.Scanner;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] ita = new int[5];
        int sum = 0;
        
        
        for(int i=0; i<5; i++){
            ita[i] = Integer.parseInt(sc.nextLine());
            sum+= ita[i];
        }
        
        Arrays.sort(ita);
        
        
        System.out.println(sum/5);
        System.out.println(ita[2]);
        
    }
}