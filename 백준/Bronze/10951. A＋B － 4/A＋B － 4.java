import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s;
        String[] sa;
        int a;
        int b;
        while(sc.hasNextLine()){
            s = sc.nextLine();
            sa = s.split(" ");
            a = Integer.parseInt(sa[0]);
            b = Integer.parseInt(sa[1]);
            System.out.println(a+b);
        }
        
        
        
    }
}