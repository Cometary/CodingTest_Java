import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] sta = sc.nextLine().split(" ");
        
        int N = Integer.parseInt(sta[0]);
        int M = Integer.parseInt(sta[1]);
        String temp;
        HashMap<String, String> hm = new HashMap<String, String>();
        for(int i=0; i<N; i++){
            temp = sc.nextLine();
            hm.put(temp, temp);
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<String> al = new ArrayList<String>();
        int index = 0;
        for(int i=0; i<M; i++){
            temp = sc.nextLine();
            if(hm.containsKey(temp)){
                al.add(temp);
                index++;
            }
        }
        Collections.sort(al);
        
        for(String a : al){
            sb.append(a+"\n");
        }
        
        System.out.println(index);
        System.out.println(sb);
    }
}