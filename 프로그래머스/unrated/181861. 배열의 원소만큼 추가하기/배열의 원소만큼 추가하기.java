class Solution {
    public int[] solution(int[] arr) {
        int num =0;
        for(int ar : arr){
            num += ar;
        }
        int[] answer = new int[num];
        num = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                answer[num] = arr[i];
                num++;
            }
        }
        return answer;
    }
}