import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] sta = sc.nextLine().split(" ");
        
        int a1 = Integer.parseInt(sta[0]);
        int a0 = Integer.parseInt(sta[1]);
        
        int c = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        
        if(a1*n+a0<=c*n && a1<=c){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        
    }
}