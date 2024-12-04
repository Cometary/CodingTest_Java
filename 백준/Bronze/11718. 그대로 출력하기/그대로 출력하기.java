import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder();
        
        String str;
        
        while(sc.hasNextLine()){
            str = sc.nextLine();
            sb.append(str+"\n");
        }
        
        System.out.println(sb);
        
    }
}