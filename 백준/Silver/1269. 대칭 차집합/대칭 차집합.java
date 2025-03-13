import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] sta = sc.nextLine().split(" ");
        
        int AN = Integer.parseInt(sta[0]);
        int BN = Integer.parseInt(sta[1]);
        
        sta = sc.nextLine().split(" ");
        
        HashMap<String, String> hm = new HashMap<String, String>();
        
        for(int i=0; i<AN; i++){
            hm.put(sta[i]," ");
        }
        
        sta = sc.nextLine().split(" ");
        
        int a = AN;
        int b = 0;
        
        for(int i=0; i<BN; i++){
            if(hm.containsKey(sta[i])){
                a--;
            }else{
                b++;
            }
        }
        
        System.out.println(a+b);
        
    }
}