using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<int> arrList = new List<int>(arr);
        int temp = 0;
        for(int i=0; i<query.Length; i++){
            if(i%2==0){
                temp = arrList.Count;
                for(int j=0; j<temp-query[i]-1; j++){
                    arrList.RemoveAt(arrList.Count-1);
                }
            }else{
                for(int j=0; j<query[i]; j++){
                    arrList.RemoveAt(0);
                }
            }
        }
        
        int[] answer = arrList.ToArray();
        return answer;
    }
}