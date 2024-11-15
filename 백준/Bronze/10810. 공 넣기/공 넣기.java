import java.util.Scanner;

public class Main{
    public static void main(String[] args){
//5 4
//1 2 3
//3 4 4
//1 4 1
//2 2 2
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String read = sc.nextLine();
        String[] arr = read.split(" ");
        int count = Integer.parseInt(arr[0]);
        int repeat = Integer.parseInt(arr[1]);
        
        int[] bucket = new int[count+1];
        int start;
        int end;
        int num;
        
        for(int i=1; i<=repeat; i++){
            read = sc.nextLine();
            arr = read.split(" ");
            start = Integer.parseInt(arr[0]);
            end = Integer.parseInt(arr[1]);
            num = Integer.parseInt(arr[2]);
            for(int j=start; j<=end; j++){
                bucket[j] = num;
            }
        }
        
        for(int i=1; i<=count; i++){
            sb.append(bucket[i]+" ");
        }
        
        System.out.println(sb);
        
    }
}