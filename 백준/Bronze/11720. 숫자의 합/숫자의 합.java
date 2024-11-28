import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        String[] sta = str.split("");
        int answer = 0;
        
        for(int i=0; i<num; i++){
            answer+= Integer.parseInt(sta[i]);
        }
        
        System.out.println(answer);
    }
}