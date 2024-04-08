using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(int[] arr) {
        List<int> intArr = new List<int>();
        int i=0;
        while(i<arr.Length){
            if(intArr.Count==0){
                intArr.Add(arr[i]);
                i++;
            }else if(intArr[intArr.Count-1]<arr[i]){
                intArr.Add(arr[i]);
                i++;
            }else if(intArr[intArr.Count-1]>=arr[i]){
                intArr.RemoveAt(intArr.Count-1);
            }
        }
        
        int[] stk = intArr.ToArray();
        return stk;
    }
}