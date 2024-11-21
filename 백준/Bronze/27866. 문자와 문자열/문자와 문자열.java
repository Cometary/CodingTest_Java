import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        int a = Integer.parseInt(sc.nextLine());
        
        System.out.println(str.charAt(a-1));
        
        
    }
}