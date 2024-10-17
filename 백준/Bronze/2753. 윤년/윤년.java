import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        
        int b = Integer.parseInt(a);
        
        if(b%400==0){
            System.out.println("1");
        }else if(b%4==0 && b%100!=0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        
    }
}