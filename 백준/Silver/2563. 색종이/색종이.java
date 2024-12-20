import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = Integer.parseInt(sc.nextLine());
        int answer = 0;
        boolean[][] xy = new boolean[100][100];
        String[] sta;
        int x;
        int y;
        for(int i=0; i<num; i++){
            sta = sc.nextLine().split(" ");
            x = Integer.parseInt(sta[0]);
            y = Integer.parseInt(sta[1]);
            
            for(int a=x; a<x+10; a++){
                for(int b=y; b<y+10; b++){
                    xy[a][b] = true;
                }
            }
        }
        
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(xy[i][j]==true){
                    answer++;
                }
            }
        }
        
        System.out.println(answer);
        
    }
}