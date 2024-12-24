import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] sta = sc.nextLine().split(" ");
        
        int answer =0;
        int a = Integer.parseInt(sta[0]);
        int b = Integer.parseInt(sta[1]);
        int c = Integer.parseInt(sta[2]);
        
        answer += (c-a)%(a-b) == 0 ? (c-a)/(a-b)+1 : (c-a)/(a-b)+2;
        
        System.out.println(answer);
    }
}