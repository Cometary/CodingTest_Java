import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = Integer.parseInt(sc.nextLine());
        Stack<Boolean> ins = new Stack<>();
        String temp;
        String[] sta;
        Boolean yesno;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<num; i++){
            temp = sc.nextLine();
            sta = temp.split("");
            yesno = true;
            ins = new Stack<>();
            
            
            for(int j=0; j<sta.length; j++){
                if(sta[j].equals("(")){
                    ins.push(true);
                }else{
                    if(ins.isEmpty()){
                        yesno = false;
                        break;
                    }else{
                        ins.pop();
                    }
                }
            }
            if(!ins.isEmpty()){
                yesno = false;
            }
            if(yesno){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
        }
        System.out.println(sb);
    }
}