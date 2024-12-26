import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(sc.nextLine());
        int c;
        
        for(int i=0; i<num; i++){
            c = Integer.parseInt(sc.nextLine());
            sb.append(c/25+" ");
            c = c%25;
            sb.append(c/10+" ");
            c = c%10;
            sb.append(c/5+" ");
            c = c%5;
            sb.append(c/1+"\n");
        }
        
        System.out.println(sb);
    }
}