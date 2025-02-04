import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = Integer.parseInt(sc.nextLine());
        long answer = 0;
        
        for(int i=1; i<num; i++){
            answer+=i;
        }
        
        System.out.println(answer);
        System.out.println(2);
    }
}