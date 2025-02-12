import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.nextLine());
        
        int answer = 0;
        int index = 1;
        int temp=0;
        int sum = 0;
        while(index<=N){
            temp=index;
            sum=0;
            sum+=index;
            while(temp>0){
                sum+= temp%10;
                temp/=10;
            }
            if(sum==N){
                answer = index;
                break;
            }
            index++;
        }
        System.out.println(answer);
    }
}