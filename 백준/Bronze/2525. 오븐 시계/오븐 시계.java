import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String HM = sc.nextLine();
        String Cook = sc.nextLine();
        
        String[] HHMM = HM.split(" ");
        
        int H = Integer.parseInt(HHMM[0]);
        int M = Integer.parseInt(HHMM[1]);
        int CM = Integer.parseInt(Cook);
        
        M+= CM;
        
        if(M>59){
            H+=M/60;
            M%=60;
        }
        
        if(H>23){
            H-=24;
        }
        
        System.out.println(H+" "+M);
        
    }
}