import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = 123456;
		
		boolean check[] = new boolean[2*N+1]; 
		for (int i = 2; i <= 2*N; i++) {
			check[i] = true;
		}
		
		// 에라토스테네스의 체
		for (int i = 2; i <= Math.sqrt(2*N); i++) {
			for (int j = i+i; j <= 2*N; j += i) {
				check[j] = false;
			}
		}
		
		while (true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int sum = 0;
			for (int i = n+1; i <= 2*n; i++) {
				if(check[i]) {
					sum++;
				}
			}
			System.out.println(sum);
		}
	}
}