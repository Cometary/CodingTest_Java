import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String sn = sc.nextLine();
        int n = Integer.parseInt(sn);
        
        gugudan(n);
        
    }
    
    public static void gugudan(int n){

        for(int i=1; i<10; i++){
            System.out.println(n+" * "+i+" = "+(i*n));
        }
        
        
    }
}