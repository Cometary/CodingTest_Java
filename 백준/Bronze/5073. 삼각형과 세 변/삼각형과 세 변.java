import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs;
        List<Integer> al;
        int temp;
        StringBuilder sb = new StringBuilder();
        int[] irr = staToIta(sc.nextLine().split(" "));
        
        while(irr[0]!=0){
            al = new ArrayList<>();
            al.add(irr[0]);
            al.add(irr[1]);
            al.add(irr[2]);
            Collections.sort(al);
            
            if(al.get(0)+al.get(1)>al.get(2)){
                hs = new HashSet<>(al);
                temp = hs.size();
                switch(temp){
                    case 1:
                        sb.append("Equilateral");
                        break;
                    case 2:
                        sb.append("Isosceles");
                        break;
                    case 3:
                        sb.append("Scalene");
                        break;
                }
                
            }else{
                sb.append("Invalid");
            }
            
            sb.append("\n");
            
            irr = staToIta(sc.nextLine().split(" "));
        }

		
		
        System.out.println(sb);
        
    }
    public static int[] staToIta(String[] sta){
        int[] res = new int[sta.length];
        for(int i=0; i<sta.length; i++){
            res[i] = Integer.parseInt(sta[i]);
        }
        return res;
    }
}
