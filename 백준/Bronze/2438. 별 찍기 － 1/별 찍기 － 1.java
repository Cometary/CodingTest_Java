import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(sc.nextLine());
        
        for(int i=0; i<num; i++){
            for(int j=0; j<=i; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        
    }
}