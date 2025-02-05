import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long num = Long.parseLong(sc.nextLine());
        
        long answer;
        
        answer = num*num*num;
        
        System.out.println(answer);
        System.out.println(3);
    }
}