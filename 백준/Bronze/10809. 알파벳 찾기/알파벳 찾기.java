import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[26];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++){
            arr[i] = str.indexOf(i+97);
            sb.append(arr[i]+" ");
        }
        
        System.out.println(sb);
    }
}