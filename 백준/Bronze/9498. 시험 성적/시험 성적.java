import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // 시험 점수를 입력받아 90 ~ 100점은 A, 
        // 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 
        // 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        
        int b = Integer.parseInt(a);
        
        if(b>89){
            a = "A";
        }else if(b>79){
            a = "B";
        }else if(b>69){
            a = "C";
        }else if(b>59){
            a = "D";
        }else{
            a = "F";
        }
        System.out.println(a);
        
    }
}