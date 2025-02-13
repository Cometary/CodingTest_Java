import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] sta = sc.nextLine().split(" ");
        int X = Integer.parseInt(sta[1]);
        int Y = Integer.parseInt(sta[0]);
        
        boolean[][] chess = new boolean[Y][X];
        
        for(int i=0; i<Y; i++){
            sta = sc.nextLine().split("");
            for(int j=0; j<X; j++){
                if(sta[j].equals("W")){
                    chess[i][j] = true;
                }else{
                    chess[i][j] = false;
                }
            }
        }
        int answer = Integer.MAX_VALUE;
        boolean Button = true;
        int temp;
        
        for(int i=0; i<Y-7; i++){
            for(int j=0; j<X-7; j++){
                temp = 0;
                for(int a=i; a<i+8; a++){
                    for(int b=j; b<j+8; b++){
                        if(chess[a][b]!=Button){
                            temp++;
                        }
                        Button = !Button;
                        
                    }
                    Button = !Button;
                }
                
                if(answer > temp){
                    answer = temp;
                }
                if(answer > 64-temp){
                    answer = 64-temp;
                }
                
            }
        }
        
        System.out.println(answer);
    }
}