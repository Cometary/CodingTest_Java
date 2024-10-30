import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int num = Integer.parseInt(s);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i =0; i<num/4; i++){
            sb.append("long ");
        }
        
        sb.append("int");
        
        System.out.println(sb.toString());
        
    }
}