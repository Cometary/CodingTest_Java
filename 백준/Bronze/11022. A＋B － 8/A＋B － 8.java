import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Case #1: 1 + 1 = 2
        //Case #2: 2 + 3 = 5
        //Case #3: 3 + 4 = 7
        //Case #4: 9 + 8 = 17
        //Case #5: 5 + 2 = 7
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(sc.nextLine());
        int a;
        int b;
        String[] temp;
        
        for(int i=1; i<=num; i++){
            sb.append("Case #"+i+": ");
            temp = sc.nextLine().split(" ");
            
            a = Integer.parseInt(temp[0]);
            b = Integer.parseInt(temp[1]);
            
            sb.append(a+" + "+b+" = "+(a+b)+"\n");
            
        }
        
        System.out.println(sb);
    }
}