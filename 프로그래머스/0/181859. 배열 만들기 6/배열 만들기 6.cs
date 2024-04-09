using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(int[] arr) {
        List<int> arrList = new List<int>();
        
        for(int i=0; i<arr.Length; i++){
            if(arrList.Count==0){
                arrList.Add(arr[i]);
            }else if(arrList[arrList.Count-1]==arr[i]){
                arrList.RemoveAt(arrList.Count-1);
            }else{
                arrList.Add(arr[i]);
            }
        }
        
        if(arrList.Count==0){
            arrList.Add(-1);
        }
        int[] answer = arrList.ToArray();
        return answer;
    }
}