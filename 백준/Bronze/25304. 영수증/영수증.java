import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String stotal = sc.nextLine();
        int total = Integer.parseInt(stotal);
        
        String snum = sc.nextLine();
        int num = Integer.parseInt(snum);
        
        String stemp;
        String[] temp;
        int a;
        int b;
        int sum = 0;
        for(int i =0; i<num; i++){
            stemp = sc.nextLine();
            temp = stemp.split(" ");
            a = Integer.parseInt(temp[0]);
            b = Integer.parseInt(temp[1]);
            sum+= a*b;
        }
        
        if(total == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}