using System;

public class Solution {
    public int[] solution(int[] arr) {
        int leng = arr.Length;
        int pow = 1;
        while(leng>pow){
            pow*=2;
        }
        int[] answer = new int[pow];
        Array.Copy(arr, 0, answer, 0, leng);
        int div = pow-leng;
        for(int i=0; i<div; i++){
            answer[leng+i] = 0;
        }
        
        return answer;
    }
}