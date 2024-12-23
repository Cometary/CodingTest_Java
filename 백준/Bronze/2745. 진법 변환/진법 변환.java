import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
        String[] sta = sc.nextLine().split(" ");
        
        int ary = Integer.parseInt(sta[1]);
        int answer = 0;
        
        answer = Integer.parseInt(sta[0], ary);
        
        System.out.println(answer);
    }
}