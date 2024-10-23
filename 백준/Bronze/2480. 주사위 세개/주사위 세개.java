import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
        //같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
        //모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
        Scanner sc = new Scanner(System.in);
        
        String ABC = sc.nextLine();
        String[] x = ABC.split(" ");
        
        int a = Integer.parseInt(x[0]);
        int b = Integer.parseInt(x[1]);
        int c = Integer.parseInt(x[2]);
        int answer = 0;
        
        if(a==b && b==c){
            answer+=10000+a*1000;
        }else if(a==b){
            answer+=1000+a*100;
        }else if(c==b){
            answer+=1000+b*100;
        }else if(a==c){
            answer+=1000+a*100;
        }else{
            answer = a;
            if(answer<b){answer = b;}
            if(answer<c){answer = c;}
            answer*=100;
        }
        System.out.println(answer);
        
        
        
    }
}