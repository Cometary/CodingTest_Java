import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int sugar = Integer.parseInt(sc.nextLine());
        int max = sugar/5;
        int temp;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<=max; i++){
            temp = sugar-(i*5);
            if(temp%3==0 && min>temp/3+i){
                min = temp/3+i;
            }
        }
        if(min==Integer.MAX_VALUE){
            min = -1;
        }
        System.out.println(min);
    }
}