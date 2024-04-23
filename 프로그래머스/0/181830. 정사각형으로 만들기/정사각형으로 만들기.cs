using System;

public class Solution {
    public int[,] solution(int[,] arr) {
        int size = arr.GetLength(0)>arr.GetLength(1) ? arr.GetLength(0) : arr.GetLength(1);
        int[,] answer = new int[size,size];
        for(int i=0; i<arr.GetLength(0); i++){
            for(int j=0; j<arr.GetLength(1); j++){
                answer[i,j] = arr[i,j];
            }
        }
        return answer;
    }
}