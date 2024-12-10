import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        
        String str = sc.nextLine();
        String[] sta = str.split("");
        int leng = sta.length;
        int answer = 1;
        
        for(int i=0; i<leng; i++){
            if(i>=leng-1-i){
                break;
            }
            if(!sta[i].equals(sta[leng-1-i])){
                answer = 0;
                break;
            }            
        }
        System.out.println(answer);
        
    }
}