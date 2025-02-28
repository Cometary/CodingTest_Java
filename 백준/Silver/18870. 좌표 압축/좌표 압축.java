import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.nextLine());
        
        String[] sta = sc.nextLine().split(" ");
        int[] ita = new int[N];
        
        for(int i=0; i<N; i++){
            ita[i] = Integer.parseInt(sta[i]);
        }
        int[] temp = ita.clone();
        Arrays.sort(temp);
        
        HashMap<Integer, Integer> imap = new HashMap<Integer, Integer>();
        
        int index = 0;
        
        for(int i=0; i<N; i++){
            if(!imap.containsKey(temp[i])){
                imap.put(temp[i], index++);    
            }
            
        }
        
        StringBuffer sb = new StringBuffer();
        
        for(int i=0; i<N; i++){
            if(i!=0){
                sb.append(" ");
            }
            sb.append(imap.get(ita[i]));
        }
        
        System.out.println(sb);
    }
}