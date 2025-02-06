import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long num = Long.parseLong(sc.nextLine());
        long answer = 0;
        
        for(int i=1; i<num-1; i++){
            answer+= i*(num-1-i);
        }
        
        System.out.println(answer);
        System.out.println(3);
    }
}