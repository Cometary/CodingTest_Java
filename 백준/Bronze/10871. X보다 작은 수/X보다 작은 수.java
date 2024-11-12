import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        String nx = sc.nextLine();
        String[] nxa = nx.split(" ");
        int num = Integer.parseInt(nxa[0]);
        int x = Integer.parseInt(nxa[1]);
        
        String ex = sc.nextLine();
        String[] exa = ex.split(" ");
        int temp;
        
        for(int i=0; i<num; i++){
            temp = Integer.parseInt(exa[i]);
            if(temp<x){
                sb.append(temp+" ");
            }
            
        }
        System.out.println(sb);
        
    }
}