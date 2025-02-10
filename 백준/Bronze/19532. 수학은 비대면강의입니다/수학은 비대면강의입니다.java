import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] sta = sc.nextLine().split(" ");
        
        int a = Integer.parseInt(sta[0]);
        int b = Integer.parseInt(sta[1]);
        int c = Integer.parseInt(sta[2]);
        int d = Integer.parseInt(sta[3]);
        int e = Integer.parseInt(sta[4]);
        int f = Integer.parseInt(sta[5]);
        
        int y = -1000;
        int x = -1000;
        
        for(int i=-999; i<1000; i++){
            for(int j=-999; j<1000; j++){
                if(a*i+b*j==c && d*i+e*j==f){
                    x = i;
                    y = j;
                    break;
                }
            }
            if(x!=-1000){
                break;
            }
        }
        
        System.out.println(x + " "+ y);
        
    }
}