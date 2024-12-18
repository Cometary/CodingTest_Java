import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] sta;
        int answer = -1;
        int x = -1;
        int y = -1;
        int temp;
        
        for(int i=0; i<9; i++){
            sta = sc.nextLine().split(" ");
            for(int j=0; j<9; j++){
                temp = Integer.parseInt(sta[j]);
                if(temp>answer){
                    answer = temp;
                    x = i+1;
                    y = j+1;
                }
            }
            
        }
        
        System.out.println(answer);
        System.out.println(x+" "+y);
    }
}