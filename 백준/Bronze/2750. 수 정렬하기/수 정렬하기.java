import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean[] bta = new boolean[2002];
        int N = Integer.parseInt(sc.nextLine());
        int M;
        for(int i=0; i<N; i++){
            M = Integer.parseInt(sc.nextLine());
            bta[M+1000] = true;
        }
        for(int i=0; i<2001; i++){
            if(bta[i]){
                System.out.println(i-1000);
            }
        }
    }
}