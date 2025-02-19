import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] sta = sc.nextLine().split(" ");
        int N = Integer.parseInt(sta[0]);
        int k = Integer.parseInt(sta[1]);
        
        sta = sc.nextLine().split(" ");
        int[] ita = new int[N];
        
        for(int i=0; i<N; i++){
            ita[i] = Integer.parseInt(sta[i]);
        }
        
        Arrays.sort(ita);
        
        System.out.println(ita[N-k]);
        
    }
}