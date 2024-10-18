import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        
        int answer = 0;
        
        if(x>0){
            answer = 1;
            if(y<0){answer = 4;}
        }else{
            answer = 2;
            if(y<0){answer = 3;}
        }
        System.out.println(answer);
    }
}