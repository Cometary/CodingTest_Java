import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.nextLine());

        int count = 0;
        for(int i = 1; i * i <= N; i++) {
            count++;
        }

        System.out.println(count);
    }


}