import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = Integer.parseInt(sc.nextLine());
        
        String list = sc.nextLine();
        String[] arr = list.split(" ");
        int sum = 0;
        int max = 0;
        int temp;
        
        for(int i=0; i<num; i++){
            temp = Integer.parseInt(arr[i]);
            sum+=temp;
            if(max<temp){
                max = temp;
            }
        }
        
        System.out.println(sum*100/(double)num/(double)max);
        
    }
}