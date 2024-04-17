using System;

public class Solution {
    public int[] solution(int[] arr, int[,] queries) {
        int[] answer = new int[queries.GetLength(0)];
        int index = 0;
        
        for(int i=0; i<queries.GetLength(0); i++){
            index =0;
            for(int j=queries[i,0]; j<=queries[i,1]; j++){
                if(index ==1 && arr[j]>queries[i,2] && answer[i]>arr[j]){
                    answer[i]=arr[j];
                }
                if(index ==0 && arr[j]>queries[i,2]){
                    answer[i]=arr[j];
                        index=1;
                }
            }
            if(index == 0){
                answer[i]=-1;
            }
        }
    
        
        return answer;
    }
}