import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] sta = sc.nextLine().split(" ");
        int a = Integer.parseInt(sta[0]);
        int b = Integer.parseInt(sta[1]);
        int c = Integer.parseInt(sta[2]);
        
        while(a>0 && b>0 && c>0){
            if(a+b<=c){
                c = a+b-1;
            }else if(a+c<=b){
                b = a+c-1;
            }else if(b+c<=a){
                a = b+c-1;
            }else{
                break;
            }
        }
        
        System.out.println(a+b+c);
        
    }
}