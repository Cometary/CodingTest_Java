import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = Integer.parseInt(sc.nextLine());
        int abs = 2;
        int x = 1;
        int answer = 0;
        
        for(int i=0; i<num; i++){
            abs+=x;
            x*=2;
        }
        
        answer = abs * abs;
        
        System.out.println(answer);
        
    }
}