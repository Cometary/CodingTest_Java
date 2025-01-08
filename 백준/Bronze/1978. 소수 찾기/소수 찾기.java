import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int index;
        int answer = 0;
        int num = Integer.parseInt(sc.nextLine());
        String[] sta = sc.nextLine().split(" ");
        int temp;
        
        for(int i=0; i<num; i++){
            temp = Integer.parseInt(sta[i]);
            index = 0;
            for(int j=1; j<=temp; j++){
                if(temp%j==0){
                    index++;
                }
            }
            if(index==2){
                answer++;
            }
        }
        System.out.println(answer);
    }
}