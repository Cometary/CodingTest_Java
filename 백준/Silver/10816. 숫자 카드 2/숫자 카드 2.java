import java.util.Scanner;
import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        //10
        //6 3 2 10 10 10 -10 -10 7 3
        //8
        //10 9 -5 2 3 4 5 -10

        //3 0 0 1 2 0 0 2
        
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        
        int size = Integer.parseInt(sc.nextLine());
        String[] sta = sc.nextLine().split(" ");
        int temp;
        
        for(int i=0; i<size; i++){
            if(hm.containsKey(sta[i])){
                temp = hm.get(sta[i]);
                hm.replace(sta[i],temp+1);
            }else{
                hm.put(sta[i],1);
            }
        }
        
        size = Integer.parseInt(sc.nextLine());
        sta = sc.nextLine().split(" ");
        
        for(int i=0; i<size; i++){
            if(hm.containsKey(sta[i])){
                temp = hm.get(sta[i]);
                sb.append(temp+ " ");
            }else{
                sb.append("0 ");
            }
        }
        
        System.out.println(sb);
    }
}