import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] x = new String[3];
        String[] y = new String[3];
        String[] sta;
        for(int i=0; i<3; i++){
            sta = sc.nextLine().split(" ");
            x[i] = sta[0];
            y[i] = sta[1];
        }
        String a;
        String b;
        
        if(x[0].equals(x[1])){
            a = x[2];
        }else if(x[0].equals(x[2])){
            a = x[1];
        }else{
            a = x[0];
        }
        if(y[0].equals(y[1])){
            b = y[2];
        }else if(y[0].equals(y[2])){
            b = y[1];
        }else{
            b = y[0];
        }
        
        System.out.println(a+" "+b);
        
    }
}