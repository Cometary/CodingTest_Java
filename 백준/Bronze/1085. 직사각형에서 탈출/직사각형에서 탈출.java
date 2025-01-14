import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] sta = sc.nextLine().split(" ");
        
        int x = Integer.parseInt(sta[0]);
        int y = Integer.parseInt(sta[1]);
        int w = Integer.parseInt(sta[2]);
        int h = Integer.parseInt(sta[3]);
        int min;
        
        int temp = w-x<x ? w-x : x;
        
        min = temp;
        
        temp = h-y<y ? h-y : y;
        
        if(min>temp){
            min = temp;
        }
        
        System.out.println(min);
        
    }
}