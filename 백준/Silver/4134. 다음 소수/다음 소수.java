import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(sc.nextLine());
        long Num;
        boolean button;
        
        for(int i=0; i<N; i++){
            
            Num = Long.parseLong(sc.nextLine());
            
            if(Num>-1 && Num<2){
                sb.append("2"+"\n");
                continue;
            }
            
            while(true){
                button = false;
                for(int j=2; j<=Math.sqrt(Num); j++){
                    if(Num%j==0){
                        button = true;
                        break;
                    }
                }
                
                
                if(!button){
                    sb.append(Num+"\n");
                    break;
                }
                
                Num++;
            }
            
            
        }
        System.out.println(sb);
    }
}