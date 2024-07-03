import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int num = score.length;
        
        Arrays.sort(score);
        
        if(num<m){
            return 0;
        }
        
        for(int i=num-m; i>=0; i-=m){
            answer+=score[i]*m;
        }
        
        return answer;
    }
}