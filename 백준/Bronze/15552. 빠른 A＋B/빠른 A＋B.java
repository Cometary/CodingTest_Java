import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String snum = br.readLine();
        int num = Integer.parseInt(snum);
        String stemp;
        String[] ss;
        int answer;
        
        for(int i=0; i<num; i++){
            answer = 0;
            stemp = br.readLine();
            ss = stemp.split(" ");
            answer += Integer.parseInt(ss[0]);
            answer += Integer.parseInt(ss[1]);
            bw.write(answer+"\n");

        }
        bw.flush();
        br.close();
        bw.close();
        
        
        
    }
}