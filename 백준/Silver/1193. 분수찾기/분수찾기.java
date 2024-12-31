import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int num = sc.nextInt();
        boolean x = true;
        // false a++ b--
        // true  a-- b++
        boolean y = false;
        // false ++
        // true  --
        for(int i=1; i<num; i++){
            if(!y && (a==1 || b==1)){
                if(x){
                    b++;
                }else{
                    a++;
                }
                x = !x;
                y = true;
            }else{
                if(!x){
                    a++;
                    b--;
                }else{
                    a--;
                    b++;
                }
                y = false;
            }
            
            
        }
        
        System.out.println(a+"/"+b);
        
        
    }
}