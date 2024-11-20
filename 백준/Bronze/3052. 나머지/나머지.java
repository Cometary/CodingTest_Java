import java.util.Scanner;
import java.util.HashSet;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        int temp;
        
        for(int i=0; i<10; i++){
            temp = Integer.parseInt(sc.nextLine());
            hs.add(temp%42);
        }
        
        System.out.println(hs.size());
        
    }
}