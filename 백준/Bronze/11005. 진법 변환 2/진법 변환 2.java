import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] sta = sc.nextLine().split(" ");
        
        String answer = Integer.toString(Integer.parseInt(sta[0]),Integer.parseInt(sta[1]));
        
        System.out.println(answer.toUpperCase());
    }
}