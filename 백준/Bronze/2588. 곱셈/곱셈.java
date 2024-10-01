import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] sa = new String[2];
        
        sa[0] = sc.nextLine();
        sa[1] = sc.nextLine();
        
        int A = Integer.parseInt(sa[0]);
        int B = Integer.parseInt(sa[1]);
        
        System.out.println(A*(B%10));
        System.out.println(A*(B/10%10));
        System.out.println(A*(B/100));
        System.out.println(A*B);
    }
}