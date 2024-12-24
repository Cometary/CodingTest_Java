import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = Integer.parseInt(sc.nextLine());
        String[] sta = sc.nextLine().split(" ");
        double[] ina = new double[size];
        for(int i=0; i<size; i++) {
            ina[i] = Double.parseDouble(sta[i]);
        }
        int submit = 0;
        int answer = 0;
        double temp = 0.0;
        double comp = 0.0;
        
        for(int i=0; i<size; i++){
            submit = 0;
            comp = Double.MAX_VALUE;
            for(int j=i-1; j>=0; j--){
                temp=(ina[i]-ina[j])/(i-j);
                if(temp<comp){
                    submit++;
                    comp=temp;
                }
            }
            comp=-Double.MAX_VALUE;
            for(int j=i+1; j<size; j++){
                temp=(ina[j]-ina[i])/(j-i);
                if(temp>comp){
                    submit++;
                    comp=temp;
                }
            }
            if(submit>answer){
                answer = submit;
            }
        }

        
        System.out.println(answer);
    }
}