import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        
        String[] b = a.split(" ");
        
        int x = Integer.parseInt(b[0]);
        int y = Integer.parseInt(b[1]);
        
        if(x>y){ System.out.println(">");}
        else if(x<y){System.out.println("<");}
        else {System.out.println("==");}
    }
}