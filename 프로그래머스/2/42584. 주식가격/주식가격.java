class Solution {
    public int[] solution(int[] prices) {
        int allTime = prices.length;
        int[] answer = new int[allTime];
        int time;
        int temp;
        
        for(int i=0; i<allTime; i++){
            time = 1;
            for(int j=i+1; j<allTime; j++){
                answer[i]++;
                if(prices[i]>prices[j]){
                    break;
                }
            }
        }
        
        
        return answer;
    }
}