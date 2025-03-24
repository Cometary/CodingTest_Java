import java.util.*;
 
 public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int N = Integer.parseInt(sc.nextLine());
 
         long[] trees = new long[N];
         
         for(int i=0; i<N; i++){
             trees[i] = Long.parseLong(sc.nextLine());
         }
         
         Arrays.sort(trees);
         
         long gcds = 0;
         long temp;
         
         for(int i=0; i<N-1; i++){
             temp = trees[i+1]-trees[i];
             
             gcds = gcd(temp, gcds);
         }
         
         long answer = (trees[N-1] - trees[0])/gcds+1-N;
         System.out.println(answer);
     }
     
     public static long gcd(long a, long b){
         while(b!=0){
             long r=a%b;
             a=b;
             b=r;
         }
         return a;
     }
 }