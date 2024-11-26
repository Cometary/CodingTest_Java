import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = Integer.parseInt(sc.nextLine());
        String str;
        StringBuilder sb = new StringBuilder();
        int index;
        for(int i=0; i<num; i++){
            str = sc.nextLine();
            index = str.length();
            sb.append(str.charAt(0));
            sb.append(str.charAt(index-1));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}