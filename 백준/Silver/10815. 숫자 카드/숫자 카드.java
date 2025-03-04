import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int M = Integer.parseInt(sc.nextLine());
        String[] msta = sc.nextLine().split(" ");
        
        int N = Integer.parseInt(sc.nextLine());
        String[] nsta = sc.nextLine().split(" ");
        
        HashMap<String, String> hm = new HashMap<String, String>();
        
        for(int i=0; i<M; i++){
            hm.put(msta[i], "true");
        }
        
        for(int i=0; i<N; i++){
            if(hm.containsKey(nsta[i])){
                sb.append("1 ");
            }else{
                sb.append("0 ");
            }
        }
        
        System.out.println(sb);
    }
}