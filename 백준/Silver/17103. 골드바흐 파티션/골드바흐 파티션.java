import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        boolean[] num = new boolean[1000001];
        num[0] = num[1] = true;
        for (int i = 2; i * i <= 1000000; i++) {
            if (!num[i]) {
                for (int j = i + i; j <= 1000000; j += i) {
                    num[j] = true;
                }
            }
        }
        
        int N = Integer.parseInt(sc.nextLine());
        int M;
        int answer = 0;
        for(int i=0; i<N; i++){
            M = Integer.parseInt(sc.nextLine());
            answer = 0;
            for(int j=2; j<=M/2; j++){
                if(!num[j] && !num[M-j]){
                    answer++;
                }
            }
            sb.append(answer+"\n");
        }
        
        
        System.out.println(sb);
    }

}
