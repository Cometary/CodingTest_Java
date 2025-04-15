import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.nextLine());
        String[] sta;
        Stack<Integer> is = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<N; i++){
            sta = sc.nextLine().split(" ");
            
            switch(sta[0]){
                case "1":
                    is.push(Integer.parseInt(sta[1]));
                    break;
                case "2":
                    if(is.empty()){
                        sb.append("-1\n");
                    } else {
                        sb.append(is.pop() + "\n");
                    }
                    break;

                case "3":
                    sb.append(is.size()+"\n");
                    break;
                case "4":
                    if(is.empty()){
                        sb.append("1"+"\n");
                    }else{
                        sb.append("0"+"\n");
                    }
                    break;
                case "5":
                    if(is.empty()){
                        sb.append("-1"+"\n");
                    }else{
                        sb.append(is.peek()+"\n");
                    }
                    break;
            }
            
        }
        
        System.out.println(sb);
    }
}