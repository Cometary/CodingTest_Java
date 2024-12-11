import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        str = str.toUpperCase();
        int leng = str.length();
        int[] arr = new int[26];
        
        for(int i=0; i<leng; i++){
            arr[str.charAt(i)-65]++;
        }
        
        int answer = 0;
        int newbie = 0;
        int old = 0;
        
        for(int i=0; i<26; i++){
            if(arr[i]>=newbie){
                old = newbie;
                newbie = arr[i];
                answer = i+65;
            }
        }
        
        if(newbie==old){
            System.out.println("?");
        }else{
            System.out.println((char)answer);
        }
        
    }
}