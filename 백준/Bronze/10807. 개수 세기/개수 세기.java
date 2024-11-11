import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = Integer.parseInt(sc.nextLine());
        
        String sn = sc.nextLine();
        String[] san = sn.split(" ");
        String ta = sc.nextLine();
        int answer = 0;
        for(int i=0; i<num; i++){
            if(san[i].equals(ta))
                answer++;
        }
        
        System.out.println(answer);
        
        
    }
}