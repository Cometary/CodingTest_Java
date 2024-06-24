import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int num = score.length;
        int[] answer = new int[num];
        int[] honor = new int[k];
        int[] arr = new int[k+1];
        int min = 2001;
        
        for(int i=0; i<num; i++){
            if(i<k){
                honor[i] = score[i];
                min = min<score[i] ? min : score[i];
                answer[i] = min;
            }else{
                System.arraycopy(honor, 0, arr, 0, k);
                arr[k] = score[i];
                Arrays.sort(arr);
                System.arraycopy(arr, 1, honor, 0, k);
                answer[i] = honor[0];
            }
        }
        
        
        return answer;
    }
}