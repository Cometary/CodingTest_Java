import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str;
        String[] sta;
        int num = 0;
        double sum = 0;
        double temp;
        
        for(int i=0; i<20; i++){
            str = sc.nextLine();
            sta = str.trim().split(" ");
            
            switch(sta[2]){
                case "P":
                    break;
                case "A+":
                    temp = Double.parseDouble(sta[1]); 
                    sum+= temp * 4.5;
                    num+=temp;
                    break;
                case "A0":
                    temp = Double.parseDouble(sta[1]); 
                    sum+= temp * 4;
                    num+=temp;
                    break;
                case "B+":
                    temp = Double.parseDouble(sta[1]); 
                    sum+= temp * 3.5;
                    num+=temp;
                    break;
                case "B0":
                    temp = Double.parseDouble(sta[1]); 
                    sum+= temp * 3;
                    num+=temp;
                    break;
                case "C+":
                    temp = Double.parseDouble(sta[1]); 
                    sum+= temp * 2.5;
                    num+=temp;
                    break;
                case "C0":
                    temp = Double.parseDouble(sta[1]); 
                    sum+= temp * 2;
                    num+=temp;
                    break;
                case "D+":
                    temp = Double.parseDouble(sta[1]); 
                    sum+= temp * 1.5;
                    num+=temp;
                    break;
                case "D0":
                    temp = Double.parseDouble(sta[1]); 
                    sum+= temp * 1;
                    num+=temp;
                    break;
                case "F":
                    temp = Double.parseDouble(sta[1]); 
                    num+=temp;
                    break;
            }
            
        }
        
        Double answer = sum / num;
        System.out.println(answer);
    }
}