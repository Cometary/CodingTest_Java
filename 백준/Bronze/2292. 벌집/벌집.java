import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sub = sc.nextInt();
        int max = 7;
        int index = 2;
        if(sub==1){
            System.out.println(1);
            return;
        }
        
        while(sub>max){
            max+= 6*index++;
        }
        
        System.out.println(index);
        
        
    }
}