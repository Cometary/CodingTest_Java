import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int n = Integer.parseInt(s);
        
        int answer = (1+n)*n/2;
        
        System.out.println(answer);
        
    }
}