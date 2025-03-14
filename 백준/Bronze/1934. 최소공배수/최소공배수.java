import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(sc.nextLine());
        
        String[] sta;
        for(int i=0; i<n; i++){
            sta= sc.nextLine().split(" ");
            int a = Integer.parseInt(sta[0]);
            int b = Integer.parseInt(sta[1]);
            int temp;
            int x = a;
            int y = b;
            while(y!=0){
                temp = x%y;
                x=y;
                y=temp;
            }
            sb.append(a*b/x+"\n");
        }
        System.out.println(sb);
    }
}