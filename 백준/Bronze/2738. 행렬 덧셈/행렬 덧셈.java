import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
/*        
3 3
1 1 1
2 2 2
0 1 0
3 3 3
4 4 4
5 5 100
*/      
        StringBuilder sb = new StringBuilder();
        String[] HW = sc.nextLine().split(" ");
        int H = Integer.parseInt(HW[0]);
        int W = Integer.parseInt(HW[1]);
        String[] arr;
        int[][] answer = new int[H][W];
        int temp;
        
        for(int i=0; i<2*H; i++){
            arr = sc.nextLine().split(" ");
            for(int j=0; j<W; j++){
                temp = Integer.parseInt(arr[j]);
                answer[i%H][j] += temp;
            }
        }
        
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                sb.append(answer[i][j]+" ");
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
        
    }
}