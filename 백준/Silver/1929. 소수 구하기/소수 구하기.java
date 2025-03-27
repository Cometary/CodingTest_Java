import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        String[] sta = sc.nextLine().split(" ");
        
        int min = Integer.parseInt(sta[0]);
        int max = Integer.parseInt(sta[1]);
        boolean isReal = false; 
        
        for(int i=min; i<=max; i++){
            isReal = false;
            
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    isReal = true;
                    break;
                }
            }
            
            if(i==1){
                isReal = true;
            }
            
            if(!isReal){
                sb.append(i+"\n");
            }
        }
        System.out.println(sb);
        
    }
}