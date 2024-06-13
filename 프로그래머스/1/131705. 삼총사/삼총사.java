import java.util.Arrays;

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int size = number.length;
        for(int a=0; a<size-2; a++){
            for(int b=a+1; b<size-1; b++){
                for(int c=b+1; c<size; c++){
                    if(number[a]+number[b]+number[c]==0){
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}