import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] sta = sc.nextLine().split(" ");
        int N = Integer.parseInt(sta[0]);
        int M = Integer.parseInt(sta[1]);
        
        HashMap<String, String> hm = new HashMap<String, String>();
        
        String temp;
        for(int i=0; i<N; i++){
            temp = sc.nextLine();
            hm.put(temp, temp);
        }
        
        int index = 0;
        for(int i=0; i<M; i++){
            temp = sc.nextLine();
            if(hm.containsKey(temp)){
                index++;
            }
        }
        System.out.println(index);
        
    }
}