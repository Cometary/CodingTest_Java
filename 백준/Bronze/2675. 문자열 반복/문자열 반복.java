import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = Integer.parseInt(sc.nextLine());
        
        String str;
        int leng;
        StringBuilder sb = new StringBuilder();
        int repeat;
        String[] sta;
        
        for(int i=0; i<num; i++){
            str = sc.nextLine();
            sta = str.split(" ");
            leng = sta[1].length();
            for(int j=0; j<leng; j++){
                for(int k=0; k<Integer.parseInt(sta[0]); k++){
                    sb.append(""+sta[1].charAt(j));    
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}