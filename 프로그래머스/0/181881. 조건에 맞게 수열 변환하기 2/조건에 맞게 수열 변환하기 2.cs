using System;

public class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int temp = 0;
        int index = 0;
        for(int i=0; i<arr.Length; i++){
            temp=0;
            index=0;
            while(temp!=arr[i]){
                temp=arr[i];
                if(arr[i]>=50 && arr[i]%2==0){
                    arr[i]/=2;
                    index++;
                }else if(arr[i]<50 && arr[i]%2==1){
                    arr[i]*=2;
                    arr[i]+=1;
                    index++;
                }else{
                    if(answer<index){
                        answer=index;
                    }
                }
            }
        }
        return answer;
    }
}