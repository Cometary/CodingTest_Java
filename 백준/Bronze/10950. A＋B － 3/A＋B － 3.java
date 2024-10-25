import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String snum = sc.nextLine();
        
        int num = Integer.parseInt(snum);
        
        String temp;
        String[] temps;
        int a;
        int b;
        int[] iab = new int[num];
        
        
        for(int i=0; i<num; i++){
            temp = sc.nextLine();
            temps = temp.split(" ");
            a = Integer.parseInt(temps[0]);
            b = Integer.parseInt(temps[1]);
            System.out.println(a+b);
        }

        
    }
}