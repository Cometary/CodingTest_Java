class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int num : numbers){
            if(answer<=n){
                answer += num;
            }else{
                return answer;
            }
        }
        return answer;
    }
}