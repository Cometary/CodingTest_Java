import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        str = str.trim();
        
        int leng = str.length();
        int answer = 1;
        for(int i=0; i<leng; i++){
            if(str.charAt(i)==32){
                answer++;
            }
        }
        if(leng==0){
            answer = 0;
        }
        System.out.println(answer);
    }
}