import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String HM = sc.nextLine();
        
        String[] HHMM = HM.split(" ");
        
        int H = Integer.parseInt(HHMM[0]);
        int M = Integer.parseInt(HHMM[1]);
        
        if(M<45){
            if(H<1){
                H=23;
                M+=15;
            }else{
                H-=1;
                M+=15;
            }
        }else{
            M-=45;
        }
        
        System.out.println(H+" "+M);
        
        
    }
}