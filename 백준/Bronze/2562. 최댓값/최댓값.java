import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int answer = 0;
        int num = 0;
        int temp;
        
        for(int i=1; i<10; i++){
            temp = Integer.parseInt(sc.nextLine());
            if(temp>answer){
                answer = temp;
                num = i;
            }
        }
        System.out.println(answer+"\n"+num);
        
        
    }
}