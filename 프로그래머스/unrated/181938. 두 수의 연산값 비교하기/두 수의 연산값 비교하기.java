class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = a+""+b;
        answer = Integer.parseInt(ab);
        if(answer<(2*a*b)){
            answer = 2*a*b;
        }
        return answer;
    }
}