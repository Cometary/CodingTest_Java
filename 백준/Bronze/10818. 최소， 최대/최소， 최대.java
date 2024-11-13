import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sn = sc.nextLine();
        int num = Integer.parseInt(sn);
        
        sn = sc.nextLine();
        String[] sna = sn.split(" ");
        
        int min = Integer.parseInt(sna[0]);
        int max = min;
        int temp;    
        
        for(int i=0; i<num; i++){
            temp = Integer.parseInt(sna[i]);
            if(temp<min){
                min = temp;
            }
            if(temp>max){
                max = temp;
            }
        }
        System.out.println(min+" "+max);
        
    }
}