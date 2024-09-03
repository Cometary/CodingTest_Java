class Solution {
    public int solution(int n) {
        int answer = 0;
        int now = 1;
        int sum = 0;
        int alpha;
        
        while(now<=n){
            sum = 0;
            alpha = now;
            
            while(sum<n){
                sum+=alpha++;
            }
            if(sum==n){
                answer++;
            }
            
            now++;
        }
        
        
        return answer;
    }
}