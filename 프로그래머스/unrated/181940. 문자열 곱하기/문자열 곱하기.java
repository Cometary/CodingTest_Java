class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        // 1ms
        // for(int i=0; i<k; i++){
        //     answer += my_string;
        // }
        
        answer = my_string.repeat(k);
        
        return answer;
    }
}