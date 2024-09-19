import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        
        String[] ab = input.split(" ");
        
        Double a = Double.parseDouble(ab[0]);
        Double b= Double.parseDouble(ab[1]);
        
        System.out.println(a/b);         
                                        
    }
}