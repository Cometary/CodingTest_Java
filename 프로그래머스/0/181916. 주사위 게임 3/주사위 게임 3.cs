using System;

public class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] dice = new int[7];
        dice[a]++;dice[b]++;dice[c]++;dice[d]++;
        if(Array.IndexOf(dice, 4)!=-1){
            answer = 1111*Array.IndexOf(dice, 4);
        }else if(Array.IndexOf(dice, 3)!=-1){
            answer = (10*Array.IndexOf(dice, 3)+Array.IndexOf(dice, 1))*(10*Array.IndexOf(dice, 3)+Array.IndexOf(dice, 1));
        }else if(Array.IndexOf(dice, 2)!=-1 && Array.IndexOf(dice, 2)!=Array.LastIndexOf(dice, 2)){
            answer = (Array.IndexOf(dice, 2)+Array.LastIndexOf(dice, 2))*(Array.IndexOf(dice, 2)-Array.LastIndexOf(dice, 2));
            if(answer<0){answer*=-1;}
        }else if(Array.IndexOf(dice, 2)!=-1){
            answer = Array.IndexOf(dice, 1)*Array.LastIndexOf(dice, 1);
        }else{
            answer = Array.IndexOf(dice, 1);
        }
        return answer;
    }
}