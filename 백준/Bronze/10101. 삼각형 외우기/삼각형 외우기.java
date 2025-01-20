import java.util.Scanner;
import java.util.HashSet;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        int sum=0;
        int temp;
        
        for(int i=0; i<3; i++){
            temp = Integer.parseInt(sc.nextLine());
            sum+=temp;
            hs.add(temp);
        }
        if(sum!=180){
            System.out.println("Error");
        }else{
            switch(hs.size()){
                case 1 :
                System.out.println("Equilateral");
                    break;
                case 2 :
                    System.out.println("Isosceles");
                    break;
                case 3 :
                    System.out.println("Scalene");
                    break;
            }
        }
        
        
    }
}