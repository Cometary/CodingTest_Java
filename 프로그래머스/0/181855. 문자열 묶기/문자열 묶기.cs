using System;

public class Solution {
    public int solution(string[] strArr) {
        int answer = 0;
        int[] plus = new int[30];
        for(int i=0; i<strArr.Length; i++){
            plus[strArr[i].Length-1]++;
        }
        for(int i=0; i<plus.Length; i++){
            if(answer<plus[i]){
                answer = plus[i];
            }
        }
        return answer;
    }
}