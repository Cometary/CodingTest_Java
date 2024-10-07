import java.math.BigInteger;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String abc = sc.nextLine();
        
        String[] abcs = abc.split(" ");
        
        BigInteger A = new BigInteger(abcs[0]);
        BigInteger B = new BigInteger(abcs[1]);
        BigInteger C = new BigInteger(abcs[2]);
        
        System.out.println(A.add(B.add(C)));
        
    }
}