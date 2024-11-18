import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String scan = sc.nextLine();
        String[] scanA = scan.split(" ");
        
        int N = Integer.parseInt(scanA[0]);
        int M = Integer.parseInt(scanA[1]);
        
        int[] arr = new int[N+1];
        
        for(int i=0; i<N+1; i++){
            arr[i] = i;
        }
        
        int a;
        int b;
        int temp;
        
        for(int i=0; i<M; i++){
            scan = sc.nextLine();
            scanA = scan.split(" ");
            a = Integer.parseInt(scanA[0]);
            b = Integer.parseInt(scanA[1]);
            
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<N+1; i++){
            sb.append(arr[i] + " ");
        }
        
        System.out.println(sb);
    }
}