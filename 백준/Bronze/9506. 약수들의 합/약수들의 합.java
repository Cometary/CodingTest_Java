import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();
        StringBuilder sb;
        int num = sc.nextInt();
        int sum = 0;
        
        while(num!=-1){
            sum = 0;
            sb = new StringBuilder();
            sb.append(num+" = ");
            for(int i=1; i<num; i++){
                if(num%i==0){
                    sum+=i;
                    if(i!=1){
                        sb.append(" + ");
                    }
                    sb.append(i);
                }
                if(sum>num){
                    break;
                }
            }
            if(sum==num){
                answer.append(sb.toString()+"\n");
            }else{
                answer.append(num+" is NOT perfect.\n");
            }
            
            
            num = sc.nextInt();
        }
        
        System.out.println(answer);
    }
}