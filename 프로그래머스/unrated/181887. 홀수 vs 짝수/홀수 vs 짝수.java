class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd = 0;
        int even = 0;
        for(int num : num_list){
            if(answer%2==0){
                even += num;
            }else{
                odd += num;
            }
            answer++;
        }
        answer = odd>even ? odd : even;
        return answer;
    }
}