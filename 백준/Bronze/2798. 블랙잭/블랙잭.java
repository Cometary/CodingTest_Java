import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] sta = sc.nextLine().split(" ");
        
        int N = Integer.parseInt(sta[0]);
        int M = Integer.parseInt(sta[1]);
        
        sta = sc.nextLine().split(" ");
        int[] ita = new int[N];
        
        for(int i=0; i<N; i++){
            ita[i] = Integer.parseInt(sta[i]);
        }
        int answer = 0;
        for(int a=0; a<N-2; a++){
            for(int b=a+1; b<N-1; b++){
                for(int c=b+1; c<N; c++){
                    if(ita[a]+ita[b]+ita[c]<=M){
                        if(answer<ita[a]+ita[b]+ita[c]){
                            answer = ita[a]+ita[b]+ita[c];
                        }
                    }
                }
            }
        }
        
        System.out.println(answer);
    }
}