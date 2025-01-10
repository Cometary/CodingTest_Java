import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(sc.nextLine());
        int n=1;
        
        while(num>1){
            n++;
            if(num%n==0){
                num/=n;
                sb.append(n+"\n");
                n=1;
            }
        }
        
        System.out.println(sb);
        
        
    }
}