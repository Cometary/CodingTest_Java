import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hm = new HashMap<String, String>();
        StringBuilder sb = new StringBuilder();
        String[] sta;
        
        int N = Integer.parseInt(sc.nextLine());
        
        for(int i=0; i<N; i++){
            sta = sc.nextLine().split(" ");
            
            if(sta[1].equals("enter")){
                hm.put(sta[0],sta[1]);
            }else{
                hm.remove(sta[0]);
            }
        }
        
        N = hm.size();
        sta = new String[N];
        int index = 0;
        for (String key: hm.keySet()) {
			sta[index++] = key;
		}
        Arrays.sort(sta);
        for(int i=index-1; i>=0; i--){
            sb.append(sta[i]+"\n");
        }
        System.out.println(sb);
    }
}