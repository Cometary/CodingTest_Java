class Solution {
    public int[] solution(int[] arr) {
        int end = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                end = i;
            }
        }
        int start = -1;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==2){
                start = i;
            }
        }
        int size = 1;
        int[] answer;
        if(end!=-1 && end-start>=0){
            size = end-start+1;
            answer = new int[size];
            for(int i=0; i<size; i++){
                answer[i] = arr[start+i];
            }
        }else{
            answer = new int[size];
            answer[0] = end==-1 ? -1 : arr[end];
        }
        
        return answer;
    }
}