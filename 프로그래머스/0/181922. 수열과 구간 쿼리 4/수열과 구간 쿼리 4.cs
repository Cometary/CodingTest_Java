using System;

public class Solution {
    public int[] solution(int[] arr, int[,] queries) {
        for(int a=0; a<queries.Length/3; a++){
            for(int b=queries[a,0]; b<=queries[a,1]; b++){
                if(b%queries[a,2]==0){
                    arr[b]++;
                }
            }
        }
        return arr;
    }
}