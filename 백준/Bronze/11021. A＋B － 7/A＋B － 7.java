import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(sc.nextLine());
        String[] sa;
        int x;
        for(int i=1; i<=num; i++){
            x = 0;
            sa = sc.nextLine().split(" ");
            x += Integer.parseInt(sa[0]);
            x += Integer.parseInt(sa[1]);
            sb.append("Case #");
            sb.append(i);
            sb.append(": ");
            sb.append(x);
            sb.append("\n");
        }
        System.out.println(sb);
        
    }
}