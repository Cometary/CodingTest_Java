import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        char c = str.charAt(0);
        
        int s = (int)c;
        
        System.out.println(s);
    }
    
}