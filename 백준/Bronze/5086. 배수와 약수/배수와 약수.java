import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        String str = sc.nextLine();
        String[] sta;
        int a;
        int b;
        
        while(!str.equals("0 0")){
            sta = str.split(" ");
            a = Integer.parseInt(sta[0]);
            b = Integer.parseInt(sta[1]);
            
            if(a/b==0 && a%b!=0){
                sb.append("factor\n");
            }else if(a/b!=0 && a%b==0){
                sb.append("multiple\n");
            }else{
                sb.append("neither\n");
            }
            
            str = sc.nextLine();
        }
        System.out.println(sb);
    }
}