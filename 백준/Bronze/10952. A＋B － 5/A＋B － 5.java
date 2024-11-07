import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String s;
        String[] sa;
        int a;
        int b;
        
        while(true){
            s = sc.nextLine();
            if(s.equals("0 0"))
                break;
            sa = s.split(" ");
            a = Integer.parseInt(sa[0]);
            b = Integer.parseInt(sa[1]);
            sb.append((a+b)+"\n");
        }
        System.out.println(sb);
        
    }
}