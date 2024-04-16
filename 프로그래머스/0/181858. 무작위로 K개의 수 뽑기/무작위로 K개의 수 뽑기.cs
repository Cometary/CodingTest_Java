using System;

public class Solution {
    public int[] solution(int[] arr, int k) {
        int[] element = new int[100001];
        int[] answer = new int[k];
        int index = 0;
        for(int i=0; i<arr.Length; i++){
            element[arr[i]]++;
            if(element[arr[i]]==1){
                answer[index]=arr[i];
                index++;
            }
            if(index==k){
                break;
            }
        }
        if(index<k){
            for(int i=index; i<k; i++){
                answer[i]=-1;
            }
        }
        
        return answer;
    }
}