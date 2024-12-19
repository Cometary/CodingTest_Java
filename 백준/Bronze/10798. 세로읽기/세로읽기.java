import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] sta;
        List<StringBuilder> sbl = new ArrayList<>();
        int leng;
        
        for(int i=0; i<5; i++){
            sta = sc.nextLine().split("");
            leng = sta.length;
            for(int j=0; j<leng; j++){
                if(sbl.size()<=j){
                    sbl.add(new StringBuilder());
                }
                sbl.set(j, sbl.get(j).append(sta[j]));
            }
            
        }
        StringBuilder answer = new StringBuilder();
        leng = sbl.size();
        for(int i=0; i<leng; i++){
            answer.append(sbl.get(i).toString());
        }
        
        System.out.println(answer);
    }
}