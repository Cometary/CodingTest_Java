import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int cycle = num*2-1;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<cycle; i++){
            if(i<num){
                for(int j=0; j<num-i-1; j++){
                    sb.append(" ");
                }
                for(int j=0; j<i*2+1; j++){
                    sb.append("*");
                }
                sb.append("\n");
            }else{
                for(int j=0; j<i-num+1; j++){
                    sb.append(" ");
                }
                for(int j=2; j<(cycle-i)*2+1; j++){
                    sb.append("*");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
        
    }
}