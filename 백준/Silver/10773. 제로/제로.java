import java.util.*;

public class Main{
    public static void main(String[] args){
        Stack<Integer> si = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int x;
        for(int i=0; i<num; i++){
            x = Integer.parseInt(sc.nextLine());
            if(x==0){
                si.pop();
            }else{
                si.push(x);
            }
        }
        num = si.size();
        int sum = 0;
        for(int i=0; i<num; i++){
            sum+= si.pop();
        }
        System.out.println(sum);
    }
}