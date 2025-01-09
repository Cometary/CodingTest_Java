import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int M = Integer.parseInt(sc.nextLine());
        int N = Integer.parseInt(sc.nextLine());
        
        int sum = 0;
        int min = 10001;
        int temp;
        
        for(int i=M; i<=N; i++){
            temp=0;
            for(int j=1; j<i; j++){
                if(i%j==0){
                    temp++;
                }
            }
            if(temp==1){
                sum+=i;
                if(i<min){
                    min = i;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        if(sum==0){
            sb.append(-1);
        }else{
            sb.append(sum+"\n");
            sb.append(min);
        }
        System.out.println(sb);
    }
}