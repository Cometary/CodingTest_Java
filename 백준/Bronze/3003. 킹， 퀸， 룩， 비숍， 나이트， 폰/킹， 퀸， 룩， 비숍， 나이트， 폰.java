import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] chess = {1, 1, 2, 2, 2, 8};
        
        String str = sc.nextLine();
        
        String[] sta = str.split(" ");
        
        StringBuilder sb = new StringBuilder();
        int temp;
        
        for(int i=0; i<6; i++){
            temp = chess[i] - Integer.parseInt(sta[i]);
            sb.append(temp+" ");
        }
        System.out.println(sb);
    }
}