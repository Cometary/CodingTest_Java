import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
		int[] x = new int[num];
		int[] y = new int[num];
		
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(x);
		Arrays.sort(y);

		System.out.println((x[num - 1] - x[0]) * (y[num - 1] - y[0]));
        
    }
}