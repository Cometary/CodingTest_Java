import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        byte[] fuse = new byte[31];
        String temp;
        int num;
        
        for(int i=0; i<28; i++){
            temp = sc.nextLine();
            num = Integer.parseInt(temp);
            fuse[num] = 0x01;
        }
        
        for(int i=1; i<=30; i++){
            if(fuse[i]!=0x01){
                sb.append(i+"\n");
            }
        }
        System.out.println(sb);
        
    }
}