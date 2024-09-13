import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String ab = sc.nextLine();
        
        String[] cd = ab.split(" ");
        
        int a = Integer.parseInt(cd[0]);
        int b = Integer.parseInt(cd[1]);
        
        System.out.println(a*b);
        
    }
}